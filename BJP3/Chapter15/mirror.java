/*
 Write a method mirror that doubles the size of a list of integers by appending the mirror image of the original sequence to the end of the list. The mirror image is the same sequence of values in reverse order. For example, if a variable called list stores this sequence of values:

[1, 3, 2, 7]

and we make the following call:

list.mirror();

then it should store the following values after the call:

[1, 3, 2, 7, 7, 2, 3, 1]

Notice that it has been doubled in size by having the original sequence appearing in reverse order at the end of the list. You may not make assumptions about how many elements are in the list. Because adding these elements might overrun the capacity of the underlying array, you may need to call ensureCapacity to enlarge this array.

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

public void mirror() {
    ensureCapacity(size*2);
    for (int i=0; i<size; i++) {
	elementData[size+i] = elementData[size-i-1];
    }
    size *= 2;
}

