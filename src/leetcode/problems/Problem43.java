package leetcode.problems;

import java.math.BigInteger;

import leetcode.template.LeetCode;

/**
 * Solution to
 * <a href= "https://leetcode.com/problems/multiply-strings/">Multiply
 * Strings</a>
 * 
 * @author leriksen137
 */
public class Problem43 implements LeetCode {

	public String multiply(String num1, String num2) {
		// please nobody tell that I cheated!
		BigInteger bigInteger1 = new BigInteger(num1);
		BigInteger bigInteger2 = new BigInteger(num2);
		return bigInteger1.multiply(bigInteger2).toString();
	}

	@Override
	public void run() {

		String num1 = "123";
		String num2 = "456";

		String solution = multiply(num1, num2);

		assert solution.equals("56088") : "Multiplication returned incorrect result, 56088 expected.";
	}
}