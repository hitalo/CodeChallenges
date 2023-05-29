package list;

import utils.ListNode;

// https://leetcode.com/problems/swap-nodes-in-pairs/
public class SwapNodesPairs {
	
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }

	public static void main(String[] args) {
		SwapNodesPairs solution = new SwapNodesPairs();
		System.out.println("Expected: 2 1 4 3");
		System.out.print("Result:   ");
		showValues(solution.swapPairs(createList()));
	}
	
	
	private static ListNode createList() {
		return new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
	}
	
	
	private static void showValues(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}

}
