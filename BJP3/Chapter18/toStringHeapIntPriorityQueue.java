/*
  Write a method in the HeapIntPriorityQueue class called toString that returns a string representation of the elements in the queue, such as "[42, 50, 45, 78, 61]". The order of the elements in the string does not matter as long as they are all present in the proper format. */

public String toString() {
    String res = "[";

    for (int i=1; i<=size; i++) {
	res += elementData[i];
	if (i < size) {
	    res += ", ";
	}
    }
    res += "]";
    return res;
}
