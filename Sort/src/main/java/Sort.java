import java.util.LinkedList;
import java.util.Random;

/**
 * 项目名:  Sort
 * 开发者:  Administrator
 * 创建于:  2022 二月 26 星期六 20:28
 * 描述:
 */
public class Sort {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		initialize(linkedList);
		System.out.println("old\t\t\t" + linkedList);
		bubbleSort(linkedList);
		selectSort(linkedList);
		insertSort(linkedList);
		shellSort(linkedList);
		quickSort(linkedList);
		mergeSort(linkedList);
	}

	public static void initialize(LinkedList<Integer> linkedList) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			linkedList.add(random.nextInt(100));
		}
	}

	public static void bubbleSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		for (int i = 0; i < tmpLinkedList.size(); i++) {
			for (int j = 0; j < tmpLinkedList.size() - 1 - i; j++) {
				if (tmpLinkedList.get(j) < tmpLinkedList.get(j + 1)) {
					switchValue(tmpLinkedList, j, j + 1);
				}
			}
		}
		System.out.println("bubbleSort\t" + tmpLinkedList);
	}

	public static void selectSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		for (int i = 0; i < tmpLinkedList.size(); i++) {
			int maxIndex = i;
			for (int j = i + 1; j < tmpLinkedList.size(); j++) {
				maxIndex = (tmpLinkedList.get(j) > tmpLinkedList.get(maxIndex)) ? j : maxIndex;
			}
			switchValue(tmpLinkedList, maxIndex, i);
		}
		System.out.println("selectSort\t" + tmpLinkedList);
	}

	public static void insertSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		for (int i = 1; i < tmpLinkedList.size(); i++) {
			int value = tmpLinkedList.get(i);
			int j = i - 1;
			for (; j >= 0 && value > tmpLinkedList.get(j); j--) {
				switchValue(tmpLinkedList, j, j + 1);
			}
			tmpLinkedList.set(j + 1, value);
		}
		System.out.println("insertSort\t" + tmpLinkedList);
	}

	public static void shellSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		for (int step = tmpLinkedList.size() / 2; step > 0; step /= 2) {
			for (int i = step; i < tmpLinkedList.size(); i++) {
				int value = tmpLinkedList.get(i);
				int j = i - step;
				for (; j >= 0 && value > tmpLinkedList.get(j); j -= step) {
					switchValue(tmpLinkedList, j, j + step);
				}
				tmpLinkedList.set(j + step, value);
			}
		}
		System.out.println("shellSort\t" + tmpLinkedList);
	}

	public static void quickSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		quickSort(tmpLinkedList, 0, tmpLinkedList.size() - 1);
		System.out.println("quickSort\t" + tmpLinkedList);
	}

	public static void quickSort(LinkedList<Integer> linkedList, int left, int right) {
		int tLeft = left, tRight = right;
		int middle = linkedList.get((left + right) / 2);
		while (tLeft <= tRight) {
			while (middle < linkedList.get(tLeft)) {
				tLeft++;
			}
			while (linkedList.get(tRight) < middle) {
				tRight--;
			}
			if (tLeft <= tRight) {
				switchValue(linkedList, tLeft, tRight);
				tLeft++;
				tRight--;
			}
		}
		if (left < tRight) {
			quickSort(linkedList, left, tLeft - 1);
		}
		if (tLeft < right) {
			quickSort(linkedList, tRight + 1, right);
		}
	}

	public static void mergeSort(LinkedList<Integer> linkedList) {
		LinkedList<Integer> tmpLinkedList = (LinkedList<Integer>) linkedList.clone();
		mergeSort(tmpLinkedList, 0, tmpLinkedList.size() - 1);
		System.out.println("mergeSort\t" + tmpLinkedList);
	}

	public static void mergeSort(LinkedList<Integer> linkedList, int left, int right) {
		if (left == right) {
			return;
		}
		int middle = (left + right) / 2;
		mergeSort(linkedList, left, middle);
		mergeSort(linkedList, middle + 1, right);
		merge(linkedList, left, middle, right);
	}

	public static void merge(LinkedList<Integer> linkedList, int left, int middle, int right) {
		int tLeft = left, tRight = middle + 1;
		LinkedList<Integer> tmpLinkedList = new LinkedList<>();
		while (tLeft <= middle && tRight <= right) {
			if (linkedList.get(tLeft) > linkedList.get(tRight)) {
				tmpLinkedList.add(linkedList.get(tLeft++));
			} else {
				tmpLinkedList.add(linkedList.get(tRight++));
			}
		}
		while (tLeft <= middle) {
			tmpLinkedList.add(linkedList.get(tLeft++));
		}
		while (tRight <= right) {
			tmpLinkedList.add(linkedList.get(tRight++));
		}
		for (int i = 0; i < tmpLinkedList.size(); i++) {
			linkedList.set(left + i, tmpLinkedList.get(i));
		}
	}

	public static void switchValue(LinkedList<Integer> linkedList, int indexFirst, int indexSecond) {
		var tmp = linkedList.get(indexFirst);
		linkedList.set(indexFirst, linkedList.get(indexSecond));
		linkedList.set(indexSecond, tmp);
	}
}
