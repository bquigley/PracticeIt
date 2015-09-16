/*
Write a method in the HashIntSet class called equals that accepts another object as a parameter and returns true if the object is another HashIntSet that contains exactly the same elements. The internal hash table size and ordering of the elements does not matter, only the sets of elements themselves. 
*/

public boolean equals(HashIntSet other) {
    return containsAll(other) && size == other.size;
}



public boolean containsAll(HashIntSet other) {
    for (Node front : other.elementData) {
	Node current = front;
	while(current != null) {
	    if (!contains(current.data)) 
		return false;
	    
	    current = current.next;
	}
    }
    return true;
}

