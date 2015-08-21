/*

 Write a method removeAll that takes an integer value as a parameter and that removes all occurrences of the given value from the list. You can assume that a method called remove exists that takes an index as a parameter and that removes the value at the given index.

For example, if the variable named list stores the following values:

[14, 5, -1, 7, 14, 7, 7, 29, 3, 7]

After the call of list.removeAll(7); the list would store the following values:

[14, 5, -1, 14, 29, 3]

Assume you are adding to the ArrayIntList class with following fields & methods:

public class ArrayIntList {
    private int[] elementData;
    private int size;
    
    public void remove(int index) { ... }

    // your code goes here
}

*/


public void removeAll(int n) {
    for (int i=0; i<size; i++) {
	if (elementData[i] == n) {
	    remove(i);
	    i--;
	}
    }
}
