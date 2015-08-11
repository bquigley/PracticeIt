/*


In this problem, the scenario we are evaluating is the following: You're standing at the base of a staircase and are heading to the top. A small stride will move up one stair, and a large stride advances two. You want to count the number of ways to climb the entire staircase based on different combinations of large and small strides. For example, a staircase of three steps can be climbed in three different ways: three small strides, one small stride followed by one large stride, or one large followed by one small.

Write a recursive method waysToClimb that takes a non-negative integer value representing a number of stairs and prints each unique way to climb a staircase of that height, taking strides of one or two stairs at a time. Your method should output each way to climb the stairs on its own line, using a 1 to indicate a small stride of 1 stair, and a 2 to indicate a large stride of 2 stairs. For example, the call of waysToClimb(3) should produce the following output:

[1, 1, 1]
[1, 2]
[2, 1]

The call of waysToClimb(4) should produce the following output:

[1, 1, 1, 1]
[1, 1, 2]
[1, 2, 1]
[2, 1, 1]
[2, 2]

The order in which you output the possible ways to climb the stairs is not important, so long as you list the right overall set of ways. There are no ways to climb zero stairs, so your method should produce no output if 0 is passed. Do not use any loops in solving this problem.


*/


public void waysToClimb(int n) {
    Stack<Integer> steps = new Stack<Integer>();
    waysToClimb(n, steps);
}

public void waysToClimb(int n, Stack<Integer> steps) {
    if (n <= 0) {
	System.out.println(steps);
	return;
    } else {
	steps.push(1);            // choose 1
	waysToClimb(n-1, steps);  // explore 
	steps.pop();              // un-choose

	if (n > 1) {
	    steps.push(2);
	    waysToClimb(n-2, steps);
	    steps.pop();
	}
    }
}


