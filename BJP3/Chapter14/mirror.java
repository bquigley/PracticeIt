/*


Write a method mirror that accepts a stack of integers as a parameter and replaces the stack contents with itself plus a mirrored version of itself (the same elements in the opposite order). For example, suppose a variable s stores the following elements:

bottom [10, 50, 19, 54, 30, 67] top

After a call of mirror(s);, the stack would store the following elements (underlined for emphasis):

bottom [10, 50, 19, 54, 30, 67, 67, 30, 54, 19, 50, 10] top

Note that the mirrored version is added on to the top of what was originally in the stack. The bottom half of the stack contains the original numbers in the same order. If your method is passed an empty stack, the result should be an empty stack. If your method is passed a null stack, your method should throw an IllegalArgumentException.

You may use one stack or one queue (but not both) as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem. For full credit your code must run in O(n) time where n is the number of elements of the original stack. Use the Queue interface and Stack/LinkedList classes from lecture.
*/

public void mirror(Stack<Integer> s) {
    if (s == null)
	throw new IllegalArgumentException();

    
    Queue<Integer> q = new LinkedList<Integer>();

    while(!s.isEmpty()) {
	q.add(s.pop());
    }

    int size = q.size();
    for (int i=0; i<size; i++) {
	int n = q.remove();
	s.push(n);
	q.add(n);
    }

    while(!s.isEmpty()) {
	q.add(s.pop());
    }

    for (int i=0; i<size; i++) {
	q.add(q.remove());
    }

    while(!q.isEmpty()) {
	s.push(q.remove());
    }

}

