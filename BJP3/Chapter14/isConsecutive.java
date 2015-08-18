/*


Write a method isConsecutive that takes a stack of integers as a parameter and that returns whether or not the stack contains a sequence of consecutive integers starting from the bottom of the stack (returning true if it does, returning false if it does not). Consecutive integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc. So if a stack s stores the following values:

bottom [3, 4, 5, 6, 7, 8, 9, 10] top

Then the call of isConsecutive(s) should return true. If the stack had instead contained this set of values:

bottom [3, 4, 5, 6, 7, 8, 9, 10, 12] top

Then the call should return false because the numbers 10 and 12 are not consecutive. Notice that we look at the numbers starting at the bottom of the stack. The following sequence of values would be consecutive except for the fact that it appears in reverse order, so the method would return false:

bottom [3, 2, 1] top

Your method must restore the stack so that it stores the same sequence of values after the call as it did before. Any stack with fewer than two values should be considered to be a list of consecutive integers. You may use one queue as auxiliary storage to solve this problem.

*/

public boolean isConsecutive(Stack<Integer> s) {
    if (s.size() < 2)
	return true;

    Queue<Integer> q = new LinkedList<Integer>();

    boolean res = true;

    int size = s.size();
    int n = s.pop();
    for (int i=1; i< size; i++) {
	if (n != s.peek() +1) {
	    res = false;
	}
	q.add(n);
	n = s.pop();
    }

    q.add(n);
    
    while(!q.isEmpty()) {
	s.push(q.remove());
    }

    while(!s.isEmpty()) {
	q.add(s.pop());
    }

    while(!q.isEmpty()) {
	s.push(q.remove());
    }
    return res;
}

