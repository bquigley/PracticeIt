/*
 Write a method isSorted that returns true if the list is in sorted (nondecreasing) order and returns false otherwise. An empty list is considered to be sorted.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}

*/

public boolean isSorted() {
    if (front == null)
	return true;
    
    ListNode current = front;
    while(current.next != null) {
	if (current.data > current.next.data)
	    return false;
	current = current.next;
    }
    return true;
}









