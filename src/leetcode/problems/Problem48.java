package leetcode.problems;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Rotate Image", url = "https://leetcode.com/problems/rotate-image/")
public class Problem48 implements LeetCode {
	public void rotate(int[][] matrix) {
		int n = matrix[0].length;

		int temp;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < (n + 1) / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
				matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
				matrix[j][n - 1 - i] = temp;
			}
		}
	}

	@Override
	public void run() {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotate(matrix);

		assert matrix[0][0] == 7 && matrix[0][1] == 4 : "Assertion failed in " + this.getClass().getName();
	}
}