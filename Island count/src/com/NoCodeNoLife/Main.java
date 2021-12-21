package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '0', '1', '1'},
                {'1', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '1'},
                {'1', '1', '0', '1', '1'}};
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int res = 0;
        int m = grid.length, n = grid[0].length;
        // traverse all grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    // The neighboring islands are transformed into oceans
    public static void dfs(char[][] grid, int i, int j) {
        int m = grid.length, n = grid[0].length;
        // illegal input
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        // already oceans
        if (grid[i][j] == '0') {
            return;
        }
        // turn to ocean
        grid[i][j] = '0';
        // traverse up\down\left\right
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}
