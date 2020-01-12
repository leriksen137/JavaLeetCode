package com.leetcode.problems.problem39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 39, problemName = "Combination Sum")
public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> solutions = new ArrayList<>();

		if (candidates.length == 0) {
			return solutions;
		}

		Arrays.sort(candidates);

		recCombinationSum(candidates, target, new ArrayList<Integer>(), 0, solutions);

		return new ArrayList<>(solutions);
	}

	private void recCombinationSum(int[] candidates, int target, List<Integer> currentSolution, int idx,
			List<List<Integer>> solutions) {
		if (target < 0) {
			return;
		} else if (target == 0) {
			solutions.add(new ArrayList<>(currentSolution));
			return;
		} else {
			for (int i = idx; i < candidates.length; i++) {
				if (target < candidates[i]) {
					return;
				}
				currentSolution.add(candidates[i]);
				recCombinationSum(candidates, target - candidates[i], currentSolution, i, solutions);
				currentSolution.remove(currentSolution.size() - 1);
			}
		}
	}
}