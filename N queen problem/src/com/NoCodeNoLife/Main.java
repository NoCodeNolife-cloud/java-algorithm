package com.NoCodeNoLife;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<LinkedList<StringBuffer>> res = solveNQueens(8);
        int times = 1;
        for (LinkedList<StringBuffer> linkedList : res) {
            System.out.println("times = " + times);
            for (StringBuffer stringBuffer : linkedList) {
                System.out.println(stringBuffer);
            }
            System.out.println();
            times++;
        }
    }

    public static LinkedList<LinkedList<StringBuffer>> solveNQueens(int n) {
        LinkedList<LinkedList<StringBuffer>> res = new LinkedList<>();
        // '.' 表⽰空，'Q' 表⽰皇后，初始化空棋盘。
        LinkedList<StringBuffer> board = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < n; j++) {
                stringBuffer.append(".");
            }
            board.add(stringBuffer);
        }

        backTrack(board, 0, res);

        return res;
    }

    public static void backTrack(LinkedList<StringBuffer> board, int row, LinkedList<LinkedList<StringBuffer>> res) {
        // 触发事件结束
        if (row == board.size()) {
            // 必须深度复制
            // 不然return返回后，LinkedList中StringBuffer又会回退到'.'
            // 浅度复制只是更换了LinkedList，里面的StringBuffer还是指向原来的StringBuffer
            LinkedList<StringBuffer> temp = new LinkedList<>();
            for (StringBuffer stringBuffer : board) {
                temp.add(new StringBuffer(stringBuffer));
            }
            res.add(temp);
            return;
        }

        int n = board.get(row).length();
        for (int col = 0; col < n; col++) {
            // 排除不合理选择
            if (!isValid(board, row, col)) {
                continue;
            }
            // 做选择
            board.get(row).setCharAt(col, 'Q');
            // 进入下一行决策
            backTrack(board, row + 1, res);
            // 撤销选择
            board.get(row).setCharAt(col, '.');
        }
    }

    public static boolean isValid(LinkedList<StringBuffer> board, int row, int col) {
        int n = board.size();
        // 检查列是否有皇后互相冲突
        for (StringBuffer stringBuffer : board) {
            if (stringBuffer.charAt(col) == 'Q') {
                return false;
            }
        }

        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }
}
