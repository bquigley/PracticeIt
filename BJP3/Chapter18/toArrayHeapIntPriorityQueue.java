/*
  Write a method in the HeapIntPriorityQueue class called toArray that returns the elements of the queue as a filled array. The order of the elements in the array is not important as long as all elements from the queue are present in the array, with no extra empty slots before or afterward. */

public int[] toArray() {
    int[] res = new int[size];
    for (int i=0; i<size; i++) {
	res[i] = elementData[i+1];
    }
    return res;
}
