/*


Write a method writeSquares that accepts an integer parameter n and prints the first n squares separated by commas, with the odd squares in descending order followed by the even squares in ascending order. The following table shows several calls to the method and their expected output:
Call 	Valued Returned
writeSquares(5); 	25, 9, 1, 4, 16
writeSquares(1); 	1
writeSquares(8); 	49, 25, 9, 1, 4, 16, 36, 64

Your method should throw an IllegalArgumentException if passed a value less than 1. Note that the output does not advance onto the next line.

*/

public void writeSquares(int n) {
    if (n < 1)
	throw new IllegalArgumentException();
    if (n == 1) {
	System.out.print(1);
	return;
    }

    if (n % 2 == 1) {
	System.out.print(n*n + ", ");
	writeSquares(n-1);
    } else {
	writeSquares(n-1);
	System.out.print(", " + n*n);
    }
}
