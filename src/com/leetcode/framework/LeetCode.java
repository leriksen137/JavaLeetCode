package com.leetcode.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.reflections.Reflections;

/**
 * @author leriksen137
 */
public class LeetCode {
	// TODO possible changes:
	// 1 Create a wizard to start new problems
	// 2 Graphical User Interface in Swing

	public static void main(String[] args) throws IOException {
		displayAllLeetCodeProblems();
	}

	public static void displayAllLeetCodeProblems() {
		Reflections reflections = new Reflections("com.leetcode.problems");
		List<Class<?>> leetCodeProblemClasses = new ArrayList<>(
				reflections.getTypesAnnotatedWith(LeetCodeProblem.class));

		if (leetCodeProblemClasses.isEmpty()) {
			System.out.println("TODO: write instructions on what to do.");
			return;
		}

		Collections.sort(leetCodeProblemClasses, new Comparator<Class<?>>() {
			@Override
			public int compare(Class<?> o1, Class<?> o2) {
				int problemNumber1 = o1.getAnnotation(LeetCodeProblem.class).problemNumber();
				int problemNumber2 = o2.getAnnotation(LeetCodeProblem.class).problemNumber();
				return Integer.compare(problemNumber1, problemNumber2);
			}
		});

		for (Class<?> leetCodeProblemClass : leetCodeProblemClasses) {
			LeetCodeProblem leetCodeProblemAnnotation = leetCodeProblemClass.getAnnotation(LeetCodeProblem.class);
			System.out.println(
					leetCodeProblemAnnotation.problemNumber() + ":\t - " + leetCodeProblemAnnotation.problemName());
		}
	}
}