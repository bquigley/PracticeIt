/*


Write a method compressDuplicates that accepts a stack of integers as a parameter and that replaces each sequence of duplicates with a pair of values: a count of the number of duplicates, followed by the actual duplicated number. For example, suppose a variable called s stores the following sequence of values:

bottom [2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17] top

If we make the call of compressDuplicates(s);, after the call s should store the following values:

bottom [5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17] top

This new stack indicates that the original had 5 occurrences of 2 at the bottom of the stack followed by 2 occurrences of -5 followed by 4 occurrences of 3, and so on. This process works best when there are many duplicates in a row. For example, if the stack instead had stored:

bottom [10, 20, 10, 20, 20, 10] top

Then the resulting stack after the call ends up being longer than the original:

bottom [1, 10, 1, 20, 1, 10, 2, 20, 1, 10] top

If the stack is empty, your method should not change it. You may use one queue as auxiliary storage to solve this problem. You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. You may not use recursion to solve this problem. For full credit your code must run in O(n) time where n is the number of elements of the original stack.
*/

public void compressDuplicates(Stack<Integer> s) {
    Stack<Integer> s2 = new Stack<Integer>();

    int n = s.pop();
    int cnt = 1;
    while(!s.isEmpty()) {
	if (n == s.peek()) {
	    cnt++;
	    s.pop();
	} else {
	    s2.push(n);
	    s2.push(cnt);
	    
	    n = s.pop();
	    cnt = 1;
	}
    }
    s.push(cnt);
    s.push(n);
    while(!s2.isEmpty())
	s.push(s2.pop());
    
}

