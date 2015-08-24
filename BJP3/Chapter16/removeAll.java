/*
 Write a method removeAll that removes all occurrences of a particular value. For example, if a variable list contains the following values:

[3, 9, 4, 2, 3, 8, 17, 4, 3, 18]

The call of list.removeAll(3); would remove all occurrences of the value 3 from the list, yielding the following values:

[9, 4, 2, 8, 17, 4, 18]

If the list is empty or the value doesn't appear in the list at all, then the list should not be changed by your method. You must preserve the original order of the elements of the list.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public void removeAll(int k) {
    if (front == null)
	return;

    while (front.data == k) {
	front = front.next;
	if (front == null) {
	    return;
	} 	    
    }

    ListNode current = front;
    
    while (current.next != null) {
	if (current.next.data == k) {
	    current.next = current.next.next;
	} else {
	    current = current.next;
	}
    }
}
