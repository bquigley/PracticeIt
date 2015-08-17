/*


Write a method collapse that takes a stack of integers as a parameter and that collapses it by replacing each successive pair of integers with the sum of the pair. For example, suppose a stack stores these values:

bottom [7, 2, 8, 9, 4, 13, 7, 1, 9, 10] top

The first pair should be collapsed into 9 (7 + 2), the second pair should be collapsed into 17 (8 + 9), the third pair should be collapsed into 17 (4 + 13) and so on to yield:

bottom [9, 17, 17, 8, 19] top

If the stack stores an odd number of elements, the final element is not collapsed. For example, the stack:

bottom [1, 2, 3, 4, 5] top

Would collapse into:

bottom [3, 7, 5] top

With the 5 at the top of the stack unchanged. You may use one queue as auxiliary storage.
*/

public void collapse(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    while(!s.isEmpty()) {
	q.add(s.pop());
    }

    while(!q.isEmpty()) {
	s.push(q.remove());
    }

    while(!s.isEmpty()) {
	q.add(s.pop());
    }

    while(!q.isEmpty()) {
	int n1 = q.remove();
	if (!q.isEmpty()) {
	    n1 += q.remove();
	}
	s.push(n1);
    }
    
}

