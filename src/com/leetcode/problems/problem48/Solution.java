package com.leetcode.problems.problem48;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 48, problemName = "Rotate Image")
public class Solution {
	public void rotate(int[][] matrix) {
		int n = matrix[0].length;

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < (n + 1) / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}

	public static void printDoubleArrayInt(int[][] arr) {
		StringBuilder line = new StringBuilder();
		System.out.println("[");
		for (int i = 0; i < arr.length; i++) {
			line.append("  [");
			for (int j = 0; j < arr[0].length; j++) {
				line.append(arr[i][j]);
				if (j != arr[0].length - 1) {
					line.append(',');
				}
			}
			line.append("]");
			if (i != arr.length - 1) {
				line.append(",");
			}
			System.out.println(line.toString());
			line.setLength(0);
		}
		System.out.println("],");
	}
}