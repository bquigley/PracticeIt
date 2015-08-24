/*
Write a method switchPairs that switches the order of elements in a linked list of integers in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values:

[3, 7, 4, 9, 8, 12]

Your method should switch the first pair (3, 7), the second pair (4, 9), the third pair (8, 12), etc. to yield this list:

[7, 3, 9, 4, 12, 8]

If there are an odd number of values, the final element is not moved. For example, if the list had been:

[3, 7, 4, 9, 8, 12, 2]

It would again switch pairs of values, but the final value (2) would not be moved, yielding this list:

[7, 3, 9, 4, 12, 8, 2]

Assume that we are adding this method to the LinkedIntList class as shown below. You may not call any other methods of the class to solve this problem, you may not construct any new nodes, and you may not use any auxiliary data structures to solve this problem (such as an array, ArrayList, Queue, String, etc.). You also may not change any data fields of the nodes. You must solve this problem by rearranging the links of the list.

    public class LinkedIntList {
        private ListNode front;
        ...
    }
    
    public class ListNode {
        public int data;
        public ListNode next;
        ...
    }
*/

public void switchPairs() {
    if (front == null)
	return;
    
    ListNode current = front;
    while(current.next != null) {
	int tmp = current.data;
	current.data = current.next.data;
	current.next.data = tmp;
	if (current.next.next != null) {
	    current = current.next.next;
	} else {
	    break;
	}
    }
    
}
