/*
 Write a method lastIndexOf that accepts an integer value as a parameter and that returns the index in the list of the last occurrence of that value, or -1 if the value is not found in the list. For example, if a variable list stores the following sequence of values, then the call of list.lastIndexOf(18) should return 6 because that is the index of the last occurrence of 18:

[1, 18, 2, 7, 18, 39, 18, 40]

If the call had instead been list.lastIndexOf(3), the method would return -1 because 3 does not appear in the list. You may not call any other methods of the class to solve this problem.

Assume that you are adding this method to the LinkedIntList class as defined below:

public class LinkedIntList {
    private ListNode front;   // null for an empty list
    ...
}
*/

public int lastIndexOf(int value) {
    ListNode current = front;
    int index = -1;
    int i = 0;
    while(current != null) {
	if (current.data == value)
	    index = i;
	i++;
	current = current.next;
    }
    return index;
}
