/*
 Write a method isPairwiseSorted that returns whether or not a list of integers is pairwise sorted (true if it is, false otherwise). A list is considered pairwise sorted if each successive pair of numbers is in sorted (non-decreasing) order. For example, if a variable called list stores the following sequence of values:

[3, 8, 2, 5, 19, 24, -3, 0, 4, 4, 8, 205, 42]

Then the call of list.isPairwiseSorted() should return true because the successive pairs of this list are all sorted: (3, 8), (2, 5), (19, 24), (-3, 0), (4, 4), (8, 205). Notice that the extra value 42 at the end had no effect on the result because it is not part of a pair. If the list had instead stored the following:

[1, 9, 3, 17, 4, 28, -5, -3, 0, 42, 308, 409, 19, 17, 2, 4]

Then the method should return false because the pair (19, 17) is not in sorted order. If a list is so short that it has no pairs, then it is considered to be pairwise sorted. If a list is of odd length, the final element should be ignored since it has no pair. In other words, if the rest of the list is pairwise sorted until that last unpaired element, your method should return true.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    // your code goes here
}

*/

public boolean isPairwiseSorted() {
    if (size < 2)
	return true;

    int test_size = size;
    if (size % 2 == 1)
	test_size = size -1;

    for (int i=0; i< test_size; i+=2) {
	if (elementData[i] > elementData[i+1])
	    return false;
    }
    
    return true;
}


