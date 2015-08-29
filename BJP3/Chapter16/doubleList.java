/*
 Write a method doubleList that doubles the size of a list by appending a copy of the original sequence to the end of the list. For example, if a variable list stores this sequence of values:

[1, 3, 2, 7]

And we make the call of list.doubleList(); then it should store the following values after the call:

[1, 3, 2, 7, 1, 3, 2, 7]

Notice that it has been doubled in size by having the original sequence appear two times in a row. You may not make assumptions about how many elements are in the list. You may not call any methods of the class to solve this problem. If the original list contains n nodes, then you should construct exactly n nodes to be added. You may not use any auxiliary data structures to solve this problem (no array, ArrayList, stack, queue, String, etc). Your method should run in O(n) time where n is the number of nodes in the list.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public void doubleList() {
    if (front == null)
	return;

    ListNode front2 = new ListNode(front.data);
    ListNode current2 = front2;
    ListNode current = front.next;
    while(current.next != null) {
	ListNode newNode = new ListNode(current.data);
	current2.next = newNode;
	current2 = current2.next;
	current = current.next;
    }
    ListNode newNode = new ListNode(current.data);
    current2.next = newNode;
    current.next = front2;
    return;
}
