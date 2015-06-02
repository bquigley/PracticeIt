/*


The Fibonacci numbers are a sequence of integers in which the first two elements are 1, and each following element is the sum of the two preceding elements. The mathematical definition of each kth Fibonacci number is the following:

F(k):
k > 2 : F(k-1) + F(k-2)
k <= 2 : 1

The first 12 Fibonacci numbers are:

1 1 2 3 5 8 13 21 34 55 89 144

Write a piece of code that uses a for loop to compute and print the first 12 Fibonacci numbers. (You may include other code, such as declaring variables before the loop, if you like.)

*/

public class fibonacci{
    public static void main(String[] args) {
	int n = 12;
	int[] fib = new int[n];
	for (int i=0; i<n; i++) {
	    if (i <= 1) {
		fib[i] = 1;
	    } else {
		fib[i] = fib[i-1] + fib[i-2];
	    }
	    System.out.print(fib[i]);
	    if (i < (n-1)) {
		System.out.print(" ");
	    } else {
		System.out.println();
	    }
	}
	
    }
}
