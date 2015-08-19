/*


Write a method interleave that accepts a queue of integers as a parameter and rearranges the elements by alternating the elements from the first half of the queue with those from the second half of the queue. For example, suppose a variable q stores the following sequence of values:

front [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] back

If we make the call of interleave(q);, the queue should store the following values after the call:

front [1, 6, 2, 7, 3, 8, 4, 9, 5, 10] back

To understand the result, consider the two halves of this list. The first half is [1, 2, 3, 4, 5] and the second half is [6, 7, 8, 9, 10]. These are combined in an alternating fashion to form a sequence of interleave pairs: the first values from each half (1 and 6), then the second values from each half (2 and 7), then the third values from each half (3 and 8), and so on. In each pair, the value from the first half appears before the value from the second half. The previous example uses sequential integers to make the interleaving more obvious, but the same process can be applied to any sequence of even length. For example, if q had instead stored these values:

front [2, 8, -5, 19, 7, 3, 24, 42] back

Then the method would have rearranged the list to become:

front [2, 7, 8, 3, -5, 24, 19, 42] back

Your method should throw an IllegalArgumentException if the queue does not have even size. You may use one stack as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem. For full credit, your solution must run in O(n) time, where n represents the size of the queue.
*/

public void interleave(Queue<Integer> q) {
    if(q == null || q.size() == 0)
	return;
    if (q.size() % 2 != 0)
	throw new IllegalArgumentException();

    Stack<Integer> s = new Stack<Integer>();

    int half = q.size() / 2;

    for (int i=0; i<half; i++) {
	s.push(q.remove());
    }
    while(!s.isEmpty())
	q.add(s.pop());

    for (int i=0; i<half; i++) {
	q.add(q.remove());
    }

    for (int i=0; i<half; i++) {
	s.push(q.remove());
    }

    for (int i=0; i<half; i++) {
	q.add(s.pop());
	q.add(q.remove());
    }
}

