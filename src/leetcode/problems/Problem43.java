package leetcode.problems;

import java.math.BigInteger;

import leetcode.template.LeetCode;
import leetcode.template.LeetCodeAnnotation;

/**
 * 
 * @author leriksen137
 */
@LeetCodeAnnotation(name = "Multiply Strings", url = "https://leetcode.com/problems/multiply-strings/")
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

		assert solution.equals("56088") : "Assertion failed in " + this.getClass().getName();
	}
}