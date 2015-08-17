/*


Write a method switchPairs that takes a stack of integers as a parameter and that switches successive pairs of numbers starting at the bottom of the stack. For example, if the stack initially stores these values:

bottom [3, 8, 17, 9, 99, 9, 17, 8, 3, 1, 2, 3, 4, 14] top

Your method should switch the first pair (3, 8), the second pair (17, 9), the third pair (99, 9), and so on, yielding this sequence:

bottom [8, 3, 9, 17, 9, 99, 8, 17, 1, 3, 3, 2, 14, 4] top

If there are an odd number of values in the stack, the value at the top of the stack is not moved. For example, if the original stack had stored:

bottom [3, 8, 17, 9, 99, 9, 17, 8, 3, 1, 2, 3, 4, 14, 42] top

It would again switch pairs of values, but the value at the top of the stack (42) would not be moved, yielding this sequence:

bottom [8, 3, 9, 17, 9, 99, 8, 17, 1, 3, 3, 2, 14, 4, 42] top

Do not make assumptions about how many elements are in the stack. Use one queue as auxiliary storage.
*/

public void switchPairs(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
    while(!s.isEmpty())
	q.add(s.pop());

    while(!q.isEmpty())
	s.push(q.remove());

    while(!s.isEmpty())
	q.add(s.pop());

    while(!q.isEmpty()) {
	int n1 = q.remove();
	if (!q.isEmpty()) {
	    s.push(q.remove());
	}
	s.push(n1);
    }
}
