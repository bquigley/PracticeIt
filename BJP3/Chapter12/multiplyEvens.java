/*

Write a method multiplyEvens that returns the product of the first n even integers. For example:
Call 	Output 	Reason
multiplyEvens(1); 	2 	2 = 2
multiplyEvens(2); 	8 	2 * 4 = 8
multiplyEvens(3); 	48 	2 * 4 * 6 = 48
multiplyEvens(4); 	384 	2 * 4 * 6 * 8 = 384

You should throw an IllegalArgumentException if passed a value less than or equal to 0.
*/

public int multiplyEvens(int n) {
    if (n < 1)
	throw new IllegalArgumentException();
    
    if (n == 1) {
	return 2;
    }
    return 2*n * multiplyEvens(n-1);
}
