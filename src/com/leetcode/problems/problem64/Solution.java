package com.leetcode.problems.problem64;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 64, problemName = "Minimum Path Sum")
public class Solution {
	private int[][] cache;

	public int minPathSum(int[][] grid) {
		if (grid[0].length == 0) {
			return 0;
		}
		int m = grid.length;
		int n = grid[0].length;

		cache = new int[m][n];
		initializeWithMinusOnesEverywhere(cache);

		return minPathRecursive(grid, m - 1, n - 1);
	}

	private void initializeWithMinusOnesEverywhere(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = -1;
			}
		}
	}

	private int minPathRecursive(int[][] grid, int m, int n) {
		if (m == 0 && n == 0) {
			return grid[0][0];
		}
		if (n == 0) {
			if (cache[m - 1][n] < 0) {
				cache[m - 1][n] = minPathRecursive(grid, m - 1, n);
			}
			return cache[m - 1][n] + grid[m][n];
		}
		if (m == 0) {
			if (cache[m][n - 1] < 0) {
				cache[m][n - 1] = minPathRecursive(grid, m, n - 1);
			}
			return cache[m][n - 1] + grid[m][n];
		}

		if (cache[m][n - 1] < 0) {
			cache[m][n - 1] = minPathRecursive(grid, m, n - 1);
		}
		if (cache[m - 1][n] < 0) {
			cache[m - 1][n] = minPathRecursive(grid, m - 1, n);
		}
		return Math.min(cache[m - 1][n], cache[m][n - 1]) + grid[m][n];
	}
}