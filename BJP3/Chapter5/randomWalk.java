/*


(This problem is a modified version of Chapter 5's randomWalk exercise from the textbook.)

Write a method named randomWalk that performs a random one-dimensional walk, reporting each position reached and the maximum position reached during the walk. The random walk should begin at position 0. On each step, you should either increase or decrease the position by 1 (with equal probability). The walk stops when 3 or -3 is hit. The output should look like this:

position = 0
position = 1
position = 0
position = -1
position = -2
position = -1
position = -2
position = -3
max position = 1

(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)
*/


public void randomWalk() {
    int p = 0;
    int max = 0;
    System.out.println("position = " + p);

    Random ran = new Random();
    while (Math.abs(p) != 3) {
	if (ran.nextBoolean()) {
	    p++;
	} else {
	    p--;
	}
	System.out.println("position = " + p);
	if (p > max) {
	    max = p;
	}
    }
    System.out.println("max position = " + max);
}
