/*
 Write a method stretch that takes an integer n as a parameter and that increases a list of integers by a factor of n by replacing each integer in the original list with n copies of that integer. For example, if a variable called list stores this sequence of values:

[18, 7, 4, 24, 11]

And we make the following call:

list.stretch(3);

The list should store the following values after the method is called:

[18, 18, 18, 7, 7, 7, 4, 4, 4, 24, 24, 24, 11, 11, 11]

If the value of n is less than or equal to 0, the list should be empty after the call.

Because adding elements might overrun the capacity of the underlying array, you may need to call ensureCapacity to enlarge this array.

Assume you are adding to the ArrayIntList class with following fields:

public class ArrayIntList {
    private int[] elementData;
    private int size;

    public void add(int value) { ... }
    public void add(int index, int value) { ... }
    public void ensureCapacity(int capacity) { ... }
    ...
    
    // your code goes here
}

*/

public void stretch(int n) {
    if (n <= 0) {
	elementData = new int[DEFAULT_CAPACITY];
	size = 0;
	return;
    }

    ensureCapacity(size * n);

    for (int i=size-1; i>=0; i--) {
	for (int j=0; j<n; j++) {
	    elementData[i*n+j] = elementData[i];
	}
    }
    size *= n;
}


    
