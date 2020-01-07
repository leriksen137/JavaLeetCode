package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import leetcode.template.LeetCode;

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/combination-sum/">Combination Sum</a>
 * 
 * @author leriksen137
 */
public class Problem39 implements LeetCode {
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

	@Override
	public void run() {
		int[] candidates = new int[] { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> solution = combinationSum(candidates, target);

		assert solution.size() == 2 : "Wrong number of solutions";
		assert solution.get(0).size() < 4 : "Solution too big";

	}
}