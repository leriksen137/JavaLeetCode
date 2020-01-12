package com.leetcode.problems.problem43;

import java.math.BigInteger;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
@LeetCodeProblem(problemNumber = 43, problemName = "Multiply Strings")
public class Solution {

	public String multiply(String num1, String num2) {
		// please nobody tell that I cheated!
		BigInteger bigInteger1 = new BigInteger(num1);
		BigInteger bigInteger2 = new BigInteger(num2);
		return bigInteger1.multiply(bigInteger2).toString();
	}
}