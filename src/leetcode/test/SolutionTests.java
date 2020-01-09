package leetcode.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import leetcode.helper.ListNode;
import leetcode.helper.ListUtil;
import leetcode.helper.PrimitiveIntArrayWrapper;
import leetcode.problems.problem11.Solution;

public class SolutionTests {

	@Test
	void solveProblem5() {
		leetcode.problems.problem5.Solution s = new leetcode.problems.problem5.Solution();

		String input = "motbaab";
		String solution = s.longestPalindrome(input);
		assert solution.equals("baab") : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem11() {
		Solution s = new leetcode.problems.problem11.Solution();

		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int solution = s.maxArea(height);
		assert solution == 49 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem17() {
		leetcode.problems.problem17.Solution s = new leetcode.problems.problem17.Solution();

		String input = "23";
		List<String> solution = s.letterCombinations(input);
		assert solution.size() == 9 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem18() {
		leetcode.problems.problem18.Solution s = new leetcode.problems.problem18.Solution();

		int[] nums = new int[] { 1, 0, -1, 0, -2, 2 };
		int target = 0;

		List<List<Integer>> solutionSet = s.fourSum(nums, target);

		assert solutionSet.size() == 3 : "Assertion failed in " + this.getClass().getName();

		// check that sum is zero
		for (List<Integer> list : solutionSet) {
			assert ListUtil.sum(list) == target : "Assertion failed in " + this.getClass().getName();
		}

		// check for no duplicates
		for (List<Integer> list1 : solutionSet) {
			for (List<Integer> list2 : solutionSet) {
				if (list1 != list2) {
					assert !list1.equals(list2) : "Assertion failed in " + this.getClass().getName();
				}
			}
		}

	}

	@Test
	void solveProblem19() {
		leetcode.problems.problem19.Solution s = new leetcode.problems.problem19.Solution();

		ListNode head = ListNode.fromArray(new int[] { 1, 2, 3, 4, 5 });
		int n = 2;
		s.removeNthFromEnd(head, n);
		assert head.toString().equals("1->2->3->5") : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem20() {
		leetcode.problems.problem20.Solution s = new leetcode.problems.problem20.Solution();

		HashMap<String, Boolean> examples = new HashMap<>();
		examples.put("()", true);
		examples.put("()[]{}", true);
		examples.put("(]", false);
		examples.put("([)]", false);
		examples.put("{[]}", true);

		for (Map.Entry<String, Boolean> example : examples.entrySet()) {
			String exampleInput = example.getKey();
			Boolean exampleOutput = example.getValue();
			Boolean myOutput = s.isValid(exampleInput);

			assert myOutput.compareTo(exampleOutput) == 0 : "Assertion failed in " + this.getClass().getName();
		}
	}

	@Test
	void solveProblem22() {
		leetcode.problems.problem22.Solution s = new leetcode.problems.problem22.Solution();

		int n = 3;
		List<String> solution = s.generateParenthesis(n);
		assert solution.size() == 5 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem26() {
		leetcode.problems.problem26.Solution s = new leetcode.problems.problem26.Solution();

		HashMap<PrimitiveIntArrayWrapper, Integer> examples = new HashMap<>();
		examples.put(new PrimitiveIntArrayWrapper(new int[] { 1, 1, 2 }), 2);
		examples.put(new PrimitiveIntArrayWrapper(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }), 5);

		for (Map.Entry<PrimitiveIntArrayWrapper, Integer> example : examples.entrySet()) {
			PrimitiveIntArrayWrapper exampleInput = example.getKey();
			Integer exampleOutput = example.getValue();
			Integer myOutput = s.removeDuplicates(exampleInput.getArray());
			assert myOutput.compareTo(exampleOutput) == 0 : "Assertion failed in " + this.getClass().getName();
		}
	}

	@Test
	void solveProblem31() {
		leetcode.problems.problem31.Solution s = new leetcode.problems.problem31.Solution();

		int[] nums = new int[] { 2, 4, 3, 1 };
		s.nextPermutation(nums);
		assert Arrays.equals(nums, new int[] { 3, 1, 2, 4 }) : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem32() {
		leetcode.problems.problem32.Solution s = new leetcode.problems.problem32.Solution();

		String s0 = "())";
		int solution = s.longestValidParentheses(s0);
		assert solution == 2 : "Assertion failed in " + this.getClass().getName();

		String s1 = "(()()";
		solution = s.longestValidParentheses(s1);
		assert solution == 4 : "Assertion failed in " + this.getClass().getName();

		String s2 = "()((())";
		solution = s.longestValidParentheses(s2);
		assert solution == 4 : "Assertion failed in " + this.getClass().getName();

		String s3 = "()(()";
		solution = s.longestValidParentheses(s3);
		assert solution == 2 : "Assertion failed in " + this.getClass().getName();

		String s4 = "())((()()(()(((()())))))))((((((())()(()()(())()))(()))(()()())((((((()())()()()(()))())(((()(()(())(()((()())())))((()(((()(()((()())())))(())))()))))))))))())()))((())()()()()))((()))(((()))()(()))()((()()()(()))(((()()()()((()()(()())))(())))))))()))))()))()((()())())(()))(((()()()((())())())(((())((()))(())(())()))))(())))()())())()(()))))(())))(())))(()((())(())))((()(()))((((()))))()((()()()())()(())(()(()()())()((())(()((()()()())()))((()))))()))())))))))()((()()))()()()()))(()()()()(())()(()))))()(((((()(((((((()(((())()))(()())()(()))(()(()((()((((()))))()(())(()))))()(()(((((((()))((()(()(()))(()())(()())()(())()(()((((()))))()()()(((())()())()))())()(())))(()()))))(())))))((((()))))(((((()))((((()))((())))))((())))())((((((((()(()((())))()))()()))))))))(((()(()())(()))((())((())(()))))))))((())()()())(()(())()))))((())())(()(())((()())))))((())((())())()(()))(())()()()((((()(()()))()(()(((((()())())())))())()))()))(()())()((()()()()((())()())(((())(((()(()()(((((((()(((()((((()(()((())))())())(())()(()())()((())()()()))()(()())()))()())))()()())))()(((((()()))(())(((()())))(())(())())(())(()()())))()())()))(()))))(()())()(()))((((())()())(())(((()())(()((((((((()))((((())())()((()()())())()()()())()()((()())(()()))((()()))()))(((()((()()(()))()(())()())((())())()(((())))(())((()((())(()()()(()(()))((()((((()(()()(())(()()))))(())()(()()))))())()((())(()))()()(()()()((()))(()))))())((()(()((";
		solution = s.longestValidParentheses(s4);
		assert solution == 910;
	}

	@Test
	void solveProblem33() {
		leetcode.problems.problem33.Solution s = new leetcode.problems.problem33.Solution();

		int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
		int target = 5;
		int position = s.search(nums, target);
		assert position == 1 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem34() {
		leetcode.problems.problem34.Solution s = new leetcode.problems.problem34.Solution();

		int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] solution = s.searchRange(nums, target);
		assert solution[0] == 3 && solution[1] == 4 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem39() {
		leetcode.problems.problem39.Solution s = new leetcode.problems.problem39.Solution();

		int[] candidates = new int[] { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> solution = s.combinationSum(candidates, target);

		assert solution.size() == 2 : "Assertion failed in " + this.getClass().getName();
		assert solution.get(0).size() < 4 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem43() {
		leetcode.problems.problem43.Solution s = new leetcode.problems.problem43.Solution();

		String num1 = "123";
		String num2 = "456";
		String solution = s.multiply(num1, num2);
		assert solution.equals("56088") : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem46() {
		leetcode.problems.problem46.Solution s = new leetcode.problems.problem46.Solution();

		int[] nums = new int[] { 1, 2, 3 };
		List<List<Integer>> solution = s.permute(nums);
		assert solution.size() == 6 : "Assertion failed in " + this.getClass().getName();
	}

	@Test
	void solveProblem48() {
		leetcode.problems.problem48.Solution s = new leetcode.problems.problem48.Solution();
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		s.rotate(matrix);
		assert matrix[0][0] == 7 && matrix[0][1] == 4 : "Assertion failed in " + this.getClass().getName();
	}

}
