/*


Write a method equals that takes as parameters two stacks of integers and returns true if the two stacks are equal and that returns false otherwise. To be considered equal, the two stacks would have to store the same sequence of integer values in the same order. Your method is to examine the two stacks but must return them to their original state before terminating. You may use one stack as auxiliary storage.

*/

public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
    Stack<Integer> s = new Stack<Integer>();
    boolean res=true;

    while (!s1.isEmpty() & !s2.isEmpty()) {
	int n1 = s1.pop();
	int n2 = s2.pop();

	s.push(n1);
	s.push(n2);
	
	if (n1 != n2) {
	    res = false;
	    break;
	}
    }

    if (!s1.isEmpty() | !s2.isEmpty()) {
	res = false;
    }

    while(!s.isEmpty()) {
	s2.push(s.pop());
	s1.push(s.pop());
    }
    
    return res;
}

