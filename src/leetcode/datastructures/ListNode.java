package leetcode.datastructures;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static ListNode fromArray(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode headCopy = head;
		for (int i = 1; i < arr.length; i++) {
			head.next = new ListNode(arr[i]);
			head = head.next;
		}
		return headCopy;
	}

	@Override
	public String toString() {
		ListNode head = this;
		StringBuilder str = new StringBuilder();
		while (head.next != null) {
			str.append(head.val);
			str.append("->");
			head = head.next;
		}
		str.append(head.val);
		return str.toString();
	}
}
