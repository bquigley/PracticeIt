/*



Write a method writeSequence that accepts an integer n as a parameter and prints a symmetric sequence of n numbers with descending integers ending in 1 followed by ascending integers beginning with 1, as in the table below:
Call 	Output
writeSequence(1); 	1
writeSequence(2); 	1 1
writeSequence(3); 	2 1 2
writeSequence(4); 	2 1 1 2
writeSequence(5); 	3 2 1 2 3
writeSequence(6); 	3 2 1 1 2 3
writeSequence(7); 	4 3 2 1 2 3 4
writeSequence(8); 	4 3 2 1 1 2 3 4
writeSequence(9); 	5 4 3 2 1 2 3 4 5
writeSequence(10); 	5 4 3 2 1 1 2 3 4 5

Notice that for odd numbers the sequence has a single 1 in the middle while for even values it has two 1s in the middle.

Your method should throw an IllegalArgumentException if passed a value less than 1. A client using this method would have to call println to complete the line of output.
*/


public void writeSequence(int n) {
    if (n < 1)
	throw new IllegalArgumentException();

    if (n == 1) {
	System.out.print(1);
	return;
    }

    if (n == 2) {
	System.out.print("1 1");
	return;
    }

    int x = (int) Math.ceil(n/2.0);
    
    System.out.print(x + " ");
    writeSequence(n-2);
    System.out.print(" " + x);
}

