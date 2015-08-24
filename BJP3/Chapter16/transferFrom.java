/* Write a method transferFrom that accepts a second LinkedIntList as a parameter and that moves values from the second list to this list. You are to attach the second list's elements to the end of this list. You are also to empty the second list. For example, suppose two lists store these sequences of values:

list1: [8, 17, 2, 4]
list2: [1, 2, 3]

The call of list1.transferFrom(list2); should leave the lists as follows:

list1: [8, 17, 2, 4, 1, 2, 3]
list2: []

The order of the arguments matters; list2.transferFrom(list1); would have left the lists as follows:

list1: []
list2: [1, 2, 3, 8, 17, 2, 4]

Either of the two lists could be empty, but you can assume that neither list is null. You are not to create any new nodes. Your method should simply change links of the lists to join them together.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}

*/

public void transferFrom(LinkedIntList list) {
    int size = list.size();
    for (int i=0; i<size; i++) {
	this.add(list.get(0));
	list.remove(0);
    }

}
