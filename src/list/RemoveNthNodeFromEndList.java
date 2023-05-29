package list;

import utils.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
public class RemoveNthNodeFromEndList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr, findEnd;
        curr = findEnd = head;
        
        for(int i = 0; i < n ; i++) findEnd = findEnd.next;
        
        if(findEnd == null) return curr.next;
        
        while(findEnd.next != null) {
            findEnd = findEnd.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        
        
        return head;
    }
	
	
	public static void main(String[] args) {
		RemoveNthNodeFromEndList solution = new RemoveNthNodeFromEndList();
		System.out.println("Expected: 1 2 3 5");
		System.out.print("Result:   ");
		showValues(solution.removeNthFromEnd(createList(), 2));
	}
	
	
	private static ListNode createList() {
		return new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
	}
	
	
	private static void showValues(ListNode head) {
		while(head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
}
