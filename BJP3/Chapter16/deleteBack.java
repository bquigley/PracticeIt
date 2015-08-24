/*
 Write a method deleteBack that deletes the last value (the value at the back of the list) and returns the deleted value. If the list is empty, your method should throw a NoSuchElementException.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}

*/

public int deleteBack() {
    if (front == null)
	throw new NoSuchElementException();

    if (front.next == null) {
	int value = front.data;
	front = null;
	return value;
    }
    
    ListNode current = front;
    while (current.next.next != null) {
	current = current.next;
    }
    int value = current.next.data;
    current.next = null;
    return value;
}

    
