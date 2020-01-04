package leetcode.helper;

import java.util.List;

public class ListUtil {
	public static int sum(List<Integer> list) {
		if (list == null || list.size() < 1)
			return 0;

		int sum = 0;
		for (Integer i : list)
			sum = sum + i;

		return sum;
	}

}
