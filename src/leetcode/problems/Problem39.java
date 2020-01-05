package leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import leetcode.template.LeetCode;

// Template for a new problem.
// Copy into leetcode.problems and follow all TODO comments.

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/combination-sum/">Combination Sum</a>
 * 
 * @author leriksen137
 */
public class Problem39 implements LeetCode {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		// create a result variable: Set of List of Integers
		Set<List<Integer>> solutions = new HashSet<List<Integer>>();

		// call a recursive function

		recCombinationSum(candidates, target, new ArrayList<Integer>(), solutions);

		// convert solutions from set of list of integers to list of list of integers
		return new ArrayList<>(solutions);
	}

	private void recCombinationSum(int[] candidates, int target, List<Integer> currentSolution,
			Set<List<Integer>> solutions) {
		for (int i = 0; i < candidates.length; i++) {
			if (target - candidates[i] == 0) {
				// add candidates[i] to current solution, sort it, then add this solution to the
				// set of solutions
				currentSolution.add(candidates[i]);
				Collections.sort(currentSolution);
				solutions.add(currentSolution);
				break;
			} else if (target - candidates[i] > 0) {
				// recursive calls with newTarget = target-candidates[i]
				currentSolution.add(candidates[i]);
				recCombinationSum(candidates, target - candidates[i], new ArrayList<Integer>(currentSolution),
						solutions);
			} else {
				System.out.println("When do I fist get here?");
				break;
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