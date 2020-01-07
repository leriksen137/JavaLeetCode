package leetcode.problems;

import leetcode.template.LeetCode;

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/container-with-most-water/">Container
 * With Most Water</a>
 * 
 * @author leriksen137
 */
public class Problem11 implements LeetCode {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int area;

		int left = 0;
		int right = height.length - 1;
		while (left != right) {
			area = calculateArea(height, left, right);
			if (area > maxArea) {
				maxArea = area;
			}
			if (height[left] > height[right]) {
				right--;
			} else {
				left++;
			}
		}

		return maxArea;
	}

	int calculateArea(int[] height, int left, int right) {
		return Math.min(height[left], height[right]) * Math.abs(left - right);
	}

	@Override
	public void run() {
		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int solution = maxArea(height);

		assert solution == 49 : "Wrong amount of water!";
	}
}