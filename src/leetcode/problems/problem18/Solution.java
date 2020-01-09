package leetcode.problems.problem18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import leetcode.template.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemName = "4Sum")
public class Solution {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		HashSet<List<Integer>> solutionSet = new HashSet<>();
		Arrays.sort(nums);

		int length = nums.length;
		for (int i = 0; i < length - 3; i++) {
			for (int j = i + 1; j < length - 2; j++) {
				// from here could reuse solution from "Two Sum" Problem 1
				for (int k = j + 1; k < length - 1; k++) {
					for (int m = k + 1; m < length; m++) {
						if (nums[i] + nums[j] + nums[k] + nums[m] == target) {
							// add solution. Automatically converts int to Integer (autoboxing)
							solutionSet.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));

						}
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(solutionSet);
	}
}