/*
 Write a method runningTotal that returns a new ArrayIntList that contains a running total of the original list. In other words, the i th value in the new list should store the sum of elements 0 through i of the original list. For example, if a variable list stores the following sequence of values:

[2, 3, 5, 4, 7, 15, 20, 7]

and the following call is made:

ArrayIntList list2 = list.runningTotal();

Then the variable list2 should store the following sequence of values:

[2, 5, 10, 14, 21, 36, 56, 63]

The original list should not be changed by the method. If the original list is empty, the result should be an empty list. The new list should have the same capacity as the original. Remember that there is a constructor for ArrayIntList that takes a capacity as a parameter:

// Constructs an empty list with the given capacity.
// Precondition: capacity >= 0
public ArrayIntList(int capacity)

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    // your code goes here
}
*/

public ArrayIntList runningTotal() {
    ArrayIntList list = new ArrayIntList(this.size());
    if (this.size() == 0)
	return list;
    
    list.add(this.get(0));

    for(int i=1; i<this.size(); i++) {
	list.add(list.get(i-1) + this.get(i));
    }
    return list;
}
