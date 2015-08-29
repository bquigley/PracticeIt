/* Write a method removeEvens that removes the values in even-numbered indexes from a list, returning a new list containing those values in their original order. For example, if a variable list1 stores these values:

list1: [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92]

And the following call is made:

LinkedIntList list2 = list1.removeEvens(); 

After the call, list1 and list2 should store the following values:

list1: [13, 4, 12, 41, 23, 92]
list2: [8, 17, 9, 98, 7, 0]

Notice that the values stored in list2 are the values that were originally in even-valued positions (index 0, 2, 4, etc.) and that these values appear in the same order as in the original list. Also notice that the values left in list1 also appear in their original relative order. Recall that LinkedIntList has a zero-argument constructor that returns an empty list. You may not call any methods of the class other than the constructor to solve this problem. You are not allowed to create any new nodes or to change the values stored in data fields to solve this problem; You must solve it by rearranging the links of the list.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public LinkedIntList removeEvens() {
    LinkedIntList even = new LinkedIntList();
    if (front == null)
	return even;

    even.front = front;
    front = front.next;
    if (front == null)
	return even;
    
    ListNode current = front;
    ListNode evenCurrent = even.front;
    ListNode next = front.next;

    int i=0;
    while(next != null) {
	if (i % 2 == 0) {
	    evenCurrent.next = next;
	    evenCurrent = evenCurrent.next;
	    current.next = null;
	} else {
	    current.next = next;
	    current = current.next;
	    evenCurrent.next = null;
	}
	next = next.next;
	i++;
    }
    
    return even;
}
