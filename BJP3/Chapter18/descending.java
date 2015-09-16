/*


Write a method called descending that accepts an array of integers and rearranges the integers in the array to be in descending order using a PriorityQueue as a helper. For example, if the array passed stores [42, 9, 22, 17, -3, 81], after the call the array should store [81, 42, 22, 17, 9, -3].

*/

import java.util.*;

public void descending(int[] x) {
    if (x.length == 0)
	return;
    
    Comparator<Integer> cmp;
    cmp = new Comparator<Integer>() {
	    public int compare(Integer e1, Integer e2) {
		return e2 - e1;
	    }
	};
    
    Queue<Integer> q = new PriorityQueue<Integer>(x.length, cmp);
    for (int i: x) {
	q.add(i);
    }

    int i=0;
    while (!q.isEmpty()) {
	x[i++] = q.poll();
    }
}
