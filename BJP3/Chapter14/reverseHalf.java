/*



Write a method reverseHalf that reverses the order of half of the elements of a Queue of integers. Your method should reverse the order of all the elements in odd-numbered positions (position 1, 3, 5, etc.) assuming that the first value in the queue has position 0. For example, if the queue originally stores this sequence of numbers when the method is called:

index: 0  1  2  3  4  5   6   7
front [1, 8, 7, 2, 9, 18, 12, 0] back

- it should store the following values after the method finishes executing:

index: 0  1  2  3   4  5  6   7
front [1, 0, 7, 18, 9, 2, 12, 8] back

Notice that numbers in even positions (positions 0, 2, 4, 6) have not moved. That sub-sequence of numbers is still: (1, 7, 9, 12). But notice that the numbers in odd positions (positions 1, 3, 5, 7) are now in reverse order relative to the original. In other words, the original sub-sequence: (8, 2, 18, 0) - has become: (0, 18, 2, 8). You may use a single stack as auxiliary storage.

*/

public void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<Integer>();

    int size = q.size();
    while(size > 1) {
	q.add(q.remove());
	s.push(q.remove());
	size -= 2;
    }
    boolean flag=false;
    if (size == 1) {
	q.add(q.remove());
	flag = true;
    }
    
    size = Math.min(q.size(), s.size());
    for (int i=0; i< size; i++) {
	q.add(q.remove());
	q.add(s.pop());
    }
    if (flag)
	q.add(q.remove());
    
}

