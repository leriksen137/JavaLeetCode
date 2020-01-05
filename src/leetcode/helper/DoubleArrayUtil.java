package leetcode.helper;

public class DoubleArrayUtil {

	public static void printDoubleArrayInt(int[][] arr) {
		StringBuilder line = new StringBuilder();
		System.out.println("[");
		for (int i = 0; i < arr.length; i++) {
			line.append("  [");
			for (int j = 0; j < arr[0].length; j++) {
				line.append(arr[i][j]);
				if (j != arr[0].length - 1) {
					line.append(',');
				}
			}
			line.append("]");
			if (i != arr.length - 1) {
				line.append(",");
			}
			System.out.println(line.toString());
			line.setLength(0);
		}
		System.out.println("],");
	}
}
