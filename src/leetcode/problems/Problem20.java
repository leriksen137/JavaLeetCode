package leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Solution to <a href="https://leetcode.com/problems/valid-parentheses/">Valid
 * Parentheses</a>
 * 
 * @author Laurent Eriksen
 */
public class Problem20 {

	public boolean isValid(String input) {

		Map<Character, Character> bracketMap = new HashMap<Character, Character>() {
			private static final long serialVersionUID = 1L;
			{
				put('(', ')');
				put('[', ']');
				put('{', '}');
			}
		};

		Stack<Character> bracketStack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			if (bracketMap.containsKey(c)) {
				bracketStack.push(c);
			} else if (bracketMap.containsValue(c)) {
				if (bracketStack.isEmpty()) {
					// too many closing brackets
					return false;
				}
				char bracket = bracketStack.pop();
				if (!bracketMap.get(bracket).equals(c)) {
					// nonmatching brackets
					return false;
				}
			} else {
				throw new IllegalArgumentException("Unexpected value: " + c);
			}
		}
		if (!bracketStack.isEmpty()) {
			// unclosed brackets remaining
			return false;
		}
		return true;
	}

	private HashMap<String, Boolean> examples = new HashMap<>();

	private void addExamples() {
		examples.put("()", true);
		examples.put("()[]{}", true);
		examples.put("(]", false);
		examples.put("([)]", false);
		examples.put("{[]}", true);
	}

	public void run() {
		addExamples();

		for (Map.Entry<String, Boolean> example : examples.entrySet()) {
			String exampleInput = example.getKey();
			Boolean exampleOutput = example.getValue();

			Boolean myOutput = isValid(exampleInput);

			try {
				if (myOutput.compareTo(exampleOutput) != 0) {
					System.out.println("Failed");
					System.out.println("\tInput:    " + exampleInput.toString());
					System.out.println("\tExpected: " + exampleOutput.toString());
					System.out.println("\tReturned: " + myOutput.toString());
					return;
				}
			} catch (NullPointerException e) {
				System.out.println("Failed");
				System.out.println("\tNullPointerException on calculating result for: " + exampleInput.toString());
				return;
			}
		}
	}

}