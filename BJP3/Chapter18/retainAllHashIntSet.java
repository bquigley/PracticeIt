/*
Write a method in the HashIntSet class called retainAll that accepts another hash set as a parameter and removes all elements from this set that are not contained in the other set. For example, if the set stores [-2, 3, 5, 6, 8] and the method is passed [2, 3, 6, 8, 11], your set would store [3, 6, 8]. 
*/

public void retainAll(HashIntSet other) {
    for (Node front : elementData) {
	Node current = front;
	while (current != null) {
	    if (!other.contains(current.data))
		remove(current.data);

	    current = current.next;
	}
    }
}
