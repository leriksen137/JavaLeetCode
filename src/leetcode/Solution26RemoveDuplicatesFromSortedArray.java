package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution to <a href=
 * "https://leetcode.com/problems/remove-duplicates-from-sorted-array/">Remove
 * Duplicates from Sorted Array</a>
 * 
 * @author Laurent Eriksen
 */
public class Solution26RemoveDuplicatesFromSortedArray {

	private static int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		int insertIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				nums[insertIndex++] = nums[i];
			}
		}
		return insertIndex;
	}

	private static void addExamples() {
		examples.put(new PrimitiveIntArrayWrapper(new int[] { 1, 1, 2 }), 2);
		examples.put(new PrimitiveIntArrayWrapper(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }), 5);
	}

	public static void run() {
		addExamples();

		for (Map.Entry<PrimitiveIntArrayWrapper, Integer> example : examples.entrySet()) {
			PrimitiveIntArrayWrapper exampleInput = example.getKey();
			Integer exampleOutput = example.getValue();

			Integer myOutput = removeDuplicates(exampleInput.getArray());

			try {
				if (myOutput.compareTo(exampleOutput) != 0) {
					System.out.println(className + ": Failed. Details:");
					System.out.println("\tInput:    " + exampleInput.toString());
					System.out.println("\tExpected: " + exampleOutput.toString());
					System.out.println("\tReturned: " + myOutput.toString());
					return;
				}
			} catch (NullPointerException e) {
				System.out.println(className + ": Failed. Details:");
				System.out.println("\tNullPointerException on calculating result for: " + exampleInput.toString());
				return;
			}
		}

		System.out.println(className + ": Success!");
	}

	private static HashMap<PrimitiveIntArrayWrapper, Integer> examples = new HashMap<>();

	private static String className = Solution26RemoveDuplicatesFromSortedArray.class.getName();

}