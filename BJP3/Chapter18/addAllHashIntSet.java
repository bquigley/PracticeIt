/*
 Write a method named addAll that could be placed inside the HashIntSet class. This method accepts another HashIntSet as a parameter and adds all elements from that set into the current set, if they are not already present. For example, if a set s1 contains [1, 2, 3] and another set s2 contains [1, 7, 3, 9], the call of s1.addAll(s2); would change s1 to store [1, 2, 3, 7, 9] in some order.

You are allowed to call methods on your set and/or the other set. Do not modify the set passed in. This method should run in O(N) time where N is the number of elements in the parameter set passed in. 
*/

public void addAll(HashIntSet other) {
    Node[] other_data = other.elementData;
    for (Node node : other_data) {
	while(node != null) {
	    add(node.data);
	    node = node.next;
	}
    }
}

