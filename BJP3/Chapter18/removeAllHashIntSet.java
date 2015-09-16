/*
Write a method in the HashIntSet class called removeAll that accepts another hash set as a parameter and ensures that this set does not contain any of the elements from the other set. For example, if the set stores [-2, 3, 5, 6, 8] and the method is passed [2, 3, 6, 8, 11], your set would store [-2, 5] after the call. 
*/

public void removeAll(HashIntSet other) {
    for (Node front : other.elementData) {
	Node current = front;
	while(current != null) {
	    if (contains(current.data))
		remove(current.data);

	    current = current.next;
	}
    }
}


