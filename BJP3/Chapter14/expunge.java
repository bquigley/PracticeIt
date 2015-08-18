/*


Write a method expunge that accepts a stack of integers as a parameter and makes sure that the stack's elements are in non-decreasing order from top to bottom, by removing from the stack any element that is smaller than any element(s) on top of it. For example, suppose a variable s stores the following elements:

bottom [4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 0] top

The element values 3, 7, 5, 8, and 4 should be removed because each has an element above it with a larger value. So the call of expunge(s); should change the stack to store the following elements in this order:

bottom [20, 15, 15, 12, 10, 5, 0] top

Notice that now the elements are in non-decreasing order from top to bottom. If the stack is empty or has just one element, nothing changes. You may assume that the stack passed is not null.

(Hint: An element e that should be removed is one that is smaller than some element above e. But since the elements above e are in sorted order, you may not need to examine all elements above e in order to know whether to remove e.)

Obey the following restrictions in your solution:

    You may use one queue or stack (but not both) as auxiliary storage. You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like.
    Use stacks/queues in stack/queue-like ways only. Do not call index-based methods such as get, search, or set (or for-each) on a stack/queue. You may call only add, remove, push, pop, peek, isEmpty, and size.

You have access to the following two methods and may call them as needed to help you solve the problem:

public static void s2q(Stack s, Queue q) { ... }
public static void q2s(Queue q, Stack s) { ... }

*/

public void expunge(Stack<Integer> s) {
    if (s.size() <= 1)
	return;
    
    Stack<Integer> s2 = new Stack<Integer>();
    s2.push(s.pop());
    
    while(!s.isEmpty()) {
	if (s.peek() >= s2.peek()) {
	    s2.push(s.pop());
	} else {
	    s.pop();
	}
    }
    while(!s2.isEmpty())
	s.push(s2.pop());
    
}

