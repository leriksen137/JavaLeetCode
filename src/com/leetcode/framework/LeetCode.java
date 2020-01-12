package com.leetcode.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.reflections.Reflections;

import com.leetcode.framework.annotations.LeetCodeProblem;

/**
 * @author leriksen137
 */
public class LeetCode {

	public static void main(String[] args) throws IOException {
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

		Collections.sort(leetCodeProblemClasses, new Comparator<Class<?>>() {
			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				return Integer.compare(o1.getAnnotation(LeetCodeProblem.class).problemNumber(),
						o2.getAnnotation(LeetCodeProblem.class).problemNumber());
			}
		});

		System.out.println("---List of all Solutions in this Project---");
		for (Class<?> leetCodeProblemClass : leetCodeProblemClasses) {
			LeetCodeProblem leetCodeProblemAnnotation = leetCodeProblemClass.getAnnotation(LeetCodeProblem.class);
			System.out.println(
					leetCodeProblemAnnotation.problemNumber() + ":\t-\t" + leetCodeProblemAnnotation.problemName());
		}
	}
}