package utils.list;

public class Utils {

	public static ListNode createList(int size) {
		return createList(size, 1);
	}
	
	private static ListNode createList(int size, int curr) {
		if(size < curr) return null;
		ListNode list = createList(size, curr+1);
		return new ListNode(curr, list);
	}
	
	
	public static void showValues(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
}
