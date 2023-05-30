package list;

import utils.list.ListNode;
import utils.list.Utils;

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
		Utils.showValues(solution.swapPairs(Utils.createList(4)));
	}
}
