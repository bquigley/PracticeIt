/*
 Write a method printInversions that lists all inversions in a list of integers. An inversion is defined as a pair of numbers where the first appears before the second in the list, but the first is greater than the second. Thus, for a sorted list such as [1, 2, 3, 4] there are no inversions at all, and printInversions would produce no output. Suppose that a variable called list stores a list in reverse order, as in [4, 3, 2, 1]. Then the call: list.printInversions(); would print many inversions:

(4, 3)
(4, 2)
(4, 1)
(3, 2)
(3, 1)
(2, 1)

You must reproduce this format exactly and output your inversions in the same order. Notice that any given number (e.g., 4 in the list above) can produce several different inversions, because there might be several numbers after it that are less than it (all of 1, 2, and 3 in the example). You may assume that the list has no duplicates.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    // your code goes here
}
*/

public void printInversions() {
    for (int i=0; i<size; i++) {
	for (int j=i+1; j<size; j++) {
	    if (elementData[j] < elementData[i]) {
		System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
	    }
	}
    }

}

