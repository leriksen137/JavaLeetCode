package com.leetcode.problems.problem46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.leetcode.framework.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 46, problemName = "Permutations")
public class Solution {
	public List<List<Integer>> permute(int[] numsArray) {
		List<Integer> nums = Arrays.stream(numsArray).boxed().collect(Collectors.toList());

		List<List<Integer>> solution = new ArrayList<>();

		recursivePermute(nums, new ArrayList<>(), solution);

		return solution;
	}

	private void recursivePermute(List<Integer> remainingNums, List<Integer> track, List<List<Integer>> solution) {
		if (remainingNums.size() == 0) {
			solution.add(new ArrayList<>(track));
			return;
		}
		for (int i = 0; i < remainingNums.size(); i++) {
			track.add(remainingNums.get(i));
			Integer temp = remainingNums.remove(i);

			recursivePermute(remainingNums, track, solution);

			remainingNums.add(i, temp);
			track.remove(remainingNums.get(i));
		}
	}
}