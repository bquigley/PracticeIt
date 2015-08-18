/*



Write a method isSorted that accepts a stack of integers as a parameter and returns true if the elements in the stack occur in ascending (non-decreasing) order from top to bottom, and false otherwise. That is, the smallest element should be on top, growing larger toward the bottom. For example, passing the following stack to your method should cause it to return true:

bottom [20, 20, 17, 11, 8, 8, 3, 2] top

The following stack is not sorted (the 15 is out of place), so passing it to your method should return a result of false:

bottom [18, 12, 15, 6, 1] top

An empty or one-element stack is considered to be sorted. When your method returns, the stack should be in the same state as when it was passed in. In other words, if your method modifies the stack, you must restore it before returning.

Obey the following restrictions in your solution:

    You may use one queue or stack (but not both) as auxiliary storage.
    You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like.
    Use the Queue interface and Stack/LinkedList classes discussed in the textbook.
    Use stacks/queues in stack/queue-like ways only. Do not call index-based methods such as get, search, or set (or use a for-each loop or iterator) on a stack/queue. You may call only add, remove, push, pop, peek, isEmpty, and size.
    Your solution should run in O(N) time, where N is the number of elements of the stack.

You have access to the following two methods and may call them as needed to help you solve the problem:

public static void s2q(Stack s, Queue q) { ... }
public static void q2s(Queue q, Stack s) { ... }

*/

public boolean isSorted(Stack<Integer> s) {
    if (s.size() <= 1)
	return true;
    
    boolean res = true;

    Stack<Integer> s2 = new Stack<Integer>();
    s2.push(s.pop());
    while(!s.isEmpty()) {
	if (s2.peek() > s.peek()) {
	    res = false;
	    break;
	}
	s2.push(s.pop());
    }

    while(!s2.isEmpty())
	s.push(s2.pop());

    return res;
}

