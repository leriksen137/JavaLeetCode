package leetcode.problems;

import leetcode.helper.DoubleArrayUtil;
import leetcode.template.LeetCode;

/**
 * Solution to <a href= "https://leetcode.com/problems/rotate-image/">Rotate
 * Image</a>
 * 
 * @author leriksen137
 */
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

		DoubleArrayUtil.printDoubleArrayInt(matrix);

		rotate(matrix);

		DoubleArrayUtil.printDoubleArrayInt(matrix);

		assert matrix[0][0] == 7 && matrix[0][1] == 4 : "Rotation incorrect";
	}
}