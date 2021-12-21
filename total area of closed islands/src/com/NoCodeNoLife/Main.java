package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '1', '1', '1', '0'},
                {'1', '0', '0', '0', '0', '1', '1', '0'},
                {'1', '0', '1', '0', '1', '1', '1', '0'},
                {'1', '0', '0', '0', '0', '1', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1', '0'},
        };
        System.out.println(numEnclaves(grid));
    }

    public static int numEnclaves(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            dfs(grid, 0, j);
            dfs(grid, m - 1, j);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0') {
                    res++;
                }
            }
        }
        return res;
    }

    public static void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        if (i < 0 || j < 0 || i >= m | j >= n) {
            return;
        }
        if (grid[i][j] == '1') {
            return;
        }
        grid[i][j] = '1';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
