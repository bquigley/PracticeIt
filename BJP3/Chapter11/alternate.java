/*



Write a method called alternate that accepts two Lists of integers as its parameters and returns a new List containing alternating elements from the two lists, in the following order:

    First element from first list
    First element from second list
    Second element from first list
    Second element from second list
    Third element from first list
    Third element from second list
    …

If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end. For example, for a first list of (1, 2, 3, 4, 5) and a second list of (6, 7, 8, 9, 10, 11, 12), a call of alternate(list1, list2) should return a list containing (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12). Do not modify the parameter lists passed in.


*/

public List alternate(List list1, List list2) {
    List res = new ArrayList<Integer>();
    int i=0;
    for (; i<list1.size() && i < list2.size(); i++) {
	res.add(list1.get(i));
	res.add(list2.get(i));
    }

    while (i < list1.size()) {
	res.add(list1.get(i));
	i++;
    }

    while (i < list2.size()) {
	res.add(list2.get(i));
	i++;
    }
    return res;
}

