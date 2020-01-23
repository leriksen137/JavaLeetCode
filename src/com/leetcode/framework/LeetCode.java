package com.leetcode.framework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.reflections.Reflections;

import com.leetcode.framework.annotations.LeetCodeProblem;
import com.leetcode.framework.json.JsonReader;

/**
 * @author leriksen137
 */
public class LeetCode {

	public static void main(String[] args) {
		displayAllLeetCodeProblems();
		processLeetCodeJson();
	}

	private static void displayAllLeetCodeProblems() {
		Reflections reflections = new Reflections("com.leetcode.problems");
		List<Class<?>> leetCodeProblemClasses = new ArrayList<>(
				reflections.getTypesAnnotatedWith(LeetCodeProblem.class));

		if (leetCodeProblemClasses.isEmpty()) {
			System.out.println("No Solutions found in Project.");
			return;
		}

		leetCodeProblemClasses
				.sort(Comparator.comparingInt((Class<?> o) -> o.getAnnotation(LeetCodeProblem.class).problemNumber()));

		System.out.println("---List of all " + leetCodeProblemClasses.size() + " Solutions in this Project---");
		for (Class<?> leetCodeProblemClass : leetCodeProblemClasses) {
			LeetCodeProblem leetCodeProblemAnnotation = leetCodeProblemClass.getAnnotation(LeetCodeProblem.class);
			System.out.println(
					leetCodeProblemAnnotation.problemNumber() + ":\t-\t" + leetCodeProblemAnnotation.problemName());
		}
	}

	private static void processLeetCodeJson() {

		String url = "https://leetcode.com/api/problems/algorithms/";
		JSONObject json = fetchLeetCodeJson(url);

		System.out.println("LeetCode username:\t\t" + json.getString("user_name"));
		System.out.println("LeetCode problems solved:\t" + json.getInt("num_solved"));
	}

	private static JSONObject fetchLeetCodeJson(String url) {
		JSONObject json = null;
		try {
			json = JsonReader.readJsonFromUrl(url);
		} catch (IOException e) {
			System.out.println("IOException");
		} catch (JSONException e) {
			System.out.println("JSONException");
		}
		return json;
	}
}