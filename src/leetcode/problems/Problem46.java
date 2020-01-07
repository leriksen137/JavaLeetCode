package leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Permutations", url = "https://leetcode.com/problems/permutations/")
public class Problem46 implements LeetCode {
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

	@Override
	public void run() {
		int[] nums = new int[] { 1, 2, 3 };

		List<List<Integer>> solution = permute(nums);

		assert solution.size() == 6 : "Assertion failed in " + this.getClass().getName();
	}
}