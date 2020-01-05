package leetcode.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import leetcode.template.LeetCode;

// Template for a new problem.
// Copy into leetcode.problems and follow all TODO comments.

/**
 * Solution to <a href=
 * "https://leetcode.com/problems/letter-combinations-of-a-phone-number/">Letter
 * Combinations of a Phone Number</a>
 * 
 * @author leriksen137
 */
public class Problem17 implements LeetCode {
	private Map<Character, String> numToChars;

	public List<String> letterCombinations(String digits) {
		if (digits.isEmpty()) {
			return Collections.emptyList();
		}

		numToChars = new HashMap<Character, String>() {
			private static final long serialVersionUID = 1L;
			{
				put('2', "abc");
				put('3', "def");
				put('4', "ghi");
				put('5', "jkl");
				put('6', "mno");
				put('7', "pqrs");
				put('8', "tuv");
				put('9', "wxyz");
			}
		};

		List<String> results = new ArrayList<>();

		recursiveLetterCombinations(results, digits, "");

		return results;
	}

	private void recursiveLetterCombinations(List<String> results, String digits, String combination) {
		if (digits.isEmpty()) {
			results.add(combination);
			return;
		}

		char num = digits.charAt(0);
		String chars = numToChars.get(num);

		for (int i = 0; i < chars.length(); i++) {
			// inefficient! String + operator always creates a new Object
			// because String is immutable
			// speedup expected if switching to StringBuilder or CharArray.
			recursiveLetterCombinations(results, digits.substring(1), combination + chars.charAt(i));
		}
	}

	@Override
	public void run() {
		String input = "23";

		List<String> solution = letterCombinations(input);

		solution = letterCombinations("");

		assert solution.size() == 9 : "Wrong output";
	}
}