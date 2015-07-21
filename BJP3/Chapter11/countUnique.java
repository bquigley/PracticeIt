/*


Write a method countUnique that takes a List of integers as a parameter and returns the number of unique integer values in the list. Use a Set as auxiliary storage to help you solve this problem.

For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
*/

public int countUnique(List list) {
    List num = new ArrayList<Integer>();
    
    for (int i=0; i<list.size(); i++) {
	if (!num.contains(list.get(i))) {
	    num.add(list.get(i));
	}
    }
    return num.size();
}

