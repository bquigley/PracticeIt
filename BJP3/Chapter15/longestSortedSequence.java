/*
 Write a method longestSortedSequence that returns the length of the longest sorted sequence within a list of integers. For example, if a variable called list stores the following sequence of values:

       
[1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17]

then the call: list.longestSortedSequence() would return the value 4 because it is the length of the longest sorted sequence within this list (the sequence -3, 0, 42, 308). If the list is empty, your method should return 0. Notice that for a non-empty list the method will always return a value of at least 1 because any individual element constitutes a sorted sequence.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    // your code goes here
}
*/

public int longestSortedSequence() {
    if (size == 0)
	return 0;

    int max = 1;
    int cnt = 1;
    for (int i=1; i< size; i++) {
	if (elementData[i] >= elementData[i-1]) {
	    cnt++;
	} else {
	    if (cnt > max)
		max = cnt;
	    cnt = 1;
	}
    }
    
    return Math.max(max, cnt);
}

