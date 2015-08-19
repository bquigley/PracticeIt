/*

 Write a method removeFront that takes an integer n as a parameter and that removes the first n values from a list of integers. For example, if a variable called list stores this sequence of values:

[8, 17, 9, 24, 42, 3, 8]

and the following call is made:

list.removeFront(4);

It should store the following after the call:

[42, 3, 8]

Notice that the first four values in the list have been removed and the other values appear in the same order as in the original list. You may assume that the parameter value passed is between 0 and the size of the list inclusive.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    // your code goes here
}
*/


public void removeFront(int k) {
    if (k<0 || k > size)
	throw new IllegalArgumentException();

    if (k == 0)
	return;


    for (int i=k; i<size; i++) {
	elementData[i-k] = elementData[i];
	elementData[i] = 0;
    }
    size -= k;
}



