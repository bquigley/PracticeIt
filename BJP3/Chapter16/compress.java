/*
 Write a method compress that could be added to the LinkedIntList class, that accepts an integer n representing a "compression factor" and replaces every n elements with a single element whose data value is the sum of those n nodes. Suppose a LinkedIntList variable named list stores the following values:

[2, 4, 18, 1, 30, -4, 5, 58, 21, 13, 19, 27]

If you made the call of list.compress(2);, the list would replace every two elements with a single element (2 + 4 = 6, 18 + 1 = 19, 30 + (-4) = 26, ...), storing the following elements:

[6, 19, 26, 63, 34, 46]

If you then followed this with a second call of list.compress(3);, the list would replace every three elements with a single element (6 + 19 + 26 = 51, 63 + 34 + 46 = 143), storing the following elements:

[51, 143]

If the list's size is not an even multiple of n, whatever elements are left over at the end are compressed into one node. For example, the original list on this page contains 12 elements, so if you made a call on it of list.compress(5);, the list would compress every five elements, (2 + 4 + 18 + 1 + 30 = 55, -4 + 5 + 58 + 21 + 13 = 93), with the last two leftover elements compressing into a final third element (19 + 27 = 46), resulting in the following list:

[55, 93, 46]

If n is greater than or equal to the list size, the entire list compresses into a single element. If the list is empty, the result after the call is empty regardless of what factor n is passed. You may assume that the value passed for n is >= 1.

For full credit, you may not create any new ListNode objects, though you may have as many ListNode variables as you like. For full credit, your solution must also run in O(n) time. Assume that you are adding this method to the LinkedIntList class below. You may not call any other methods of the class.

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public void compress(int n) {
    if (front == null)
	return;

    ListNode current = front;
    
    while(current != null) {
	int value = 0;
	ListNode start = current;
	for (int i=0; i<n; i++) {
	    if (current != null) {
		value += current.data;
		current = current.next;
	    }
	}
	start.data = value;
	if (current == null) {
	    start.next = null;
	} else {
	    start.next = current;
	}
	
    }

}








