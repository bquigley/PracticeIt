/* Write a method rotate that moves the value at the front of a list of integers to the end of the list. For example, if a variable called list stores the following sequence of values:

[8, 23, 19, 7, 45, 98, 102, 4]

Then the call of list.rotate(); should move the value 8 from the front of the list to the back of the list, yielding this sequence of values:

[23, 19, 7, 45, 98, 102, 4, 8]

The other values in the list should retain the same order as in the original list. If the method is called for a list of 0 or 1 elements it should have no effect on the list. You are not allowed to construct any new nodes to solve this problem and you are not allowed to change any of the integer values stored in the nodes. You must solve the problem by rearranging the links of the list.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public void rotate(){
    if (front == null || front.next == null)
	return;

    ListNode frontNode = front;
    front = front.next;
    frontNode.next = null;
    ListNode current = front;
    while(current.next != null) {
	current = current.next;
    }
    current.next = frontNode;
    return;
}

