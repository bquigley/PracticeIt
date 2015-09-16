/*
 Write a method in the HashIntSet class called toString that returns a string representation of the elements in the set, such as "[-2, 3, 5, 6, 8]". The order of the elements in the string does not matter as long as they are all present in the proper format. Do not use any other auxiliary collections to help you. Do not list any empty or meaningless indexes in the string. Do not modify the state of the set.
*/

public String toString() {
    int[] array = toArray();
    String res = "[";

    for (int i=0; i<size; i++) {
	res += array[i];
	if (i < size -1)
	    res += ", ";
    }
    res += "]";
    return res;
}

public int[] toArray() {
    int[] res = new int[size];
    int i= 0;
    for (Node front : elementData) {
	Node current = front;
	while(current != null) {
	    res[i++] = current.data;
	    current = current.next;
	}
    }
    return res;
}

