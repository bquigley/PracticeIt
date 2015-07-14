/*

Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the list to the front, otherwise preserving the order of the elements. For example, if a variable called list stores the following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); it should store the following values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume that the list stores at least one value. 

*/

public void minToFront(ArrayList<Integer> list) {
    int min = list.get(0);
    int idx = 0;
    for (int i=0;i< list.size(); i++) {
	if (list.get(i) < min) {
	    min = list.get(i);
	    idx = i;
	}
    }

    list.remove(idx);
    list.add(0, min);

}
