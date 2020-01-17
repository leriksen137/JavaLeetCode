package com.leetcode.framework;

import com.leetcode.framework.annotations.LeetCodeProblem;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author leriksen137
 */
public class LeetCode {

	public static void main(String[] args) {
		displayAllLeetCodeProblems();
	}

	public static void displayAllLeetCodeProblems() {
		Reflections reflections = new Reflections("com.leetcode.problems");
		List<Class<?>> leetCodeProblemClasses = new ArrayList<>(
				reflections.getTypesAnnotatedWith(LeetCodeProblem.class));

		if (leetCodeProblemClasses.isEmpty()) {
			System.out.println("No Solutions found in Project.");
			return;
		}

		leetCodeProblemClasses.sort(Comparator.comparingInt((Class<?> o) -> o.getAnnotation(LeetCodeProblem.class).problemNumber()));

		System.out.println("---List of all " + leetCodeProblemClasses.size() + " Solutions in this Project---");
		for (Class<?> leetCodeProblemClass : leetCodeProblemClasses) {
			LeetCodeProblem leetCodeProblemAnnotation = leetCodeProblemClass.getAnnotation(LeetCodeProblem.class);
			StringBuilder lineBuilder = new StringBuilder();
			lineBuilder.append(leetCodeProblemAnnotation.problemNumber()).append(":");
			if (leetCodeProblemAnnotation.problemNumber() < 100) {
				lineBuilder.append("\t");
			}
			lineBuilder.append("\t-\t").append(leetCodeProblemAnnotation.problemName());
			System.out.println(lineBuilder.toString());
		}
	}
}