package leetcode.problems;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Next Permutation", url = "https://leetcode.com/problems/next-permutation/")
public class Problem31 implements LeetCode {

	public void nextPermutation(int[] nums) {

	}

	@Override
	public void run() {
		int[] nums = new int[] { 2, 4, 3, 1 };

		nextPermutation(nums);

		assert nums != nums : "Assertion failed in " + this.getClass().getName();

	}
}