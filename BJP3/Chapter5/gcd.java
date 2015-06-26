/*


Write a method named gcd that accepts two integers as parameters and returns the greatest common divisor of the two numbers. The greatest common divisor (GCD) of two integers a and b is the largest integer that is a factor of both a and b. The GCD of any number and 1 is 1, and the GCD of any number and 0 is that number.

One efficient way to compute the GCD of two numbers is to use Euclid's algorithm, which states the following:

GCD(A, B) = GCD(B, A % B)
GCD(A, 0) = Absolute value of A

In other words, if you repeatedly mod A by B and then swap the two values, eventually B will store 0 and A will store the greatest common divisor.

For example: gcd(24, 84) returns 12, gcd(105, 45) returns 15, and gcd(0, 8) returns 8.
*/


public int gcd(int A, int B) {
    if ( B == 0) {
	return Math.abs(A);
    }
    return gcd(B, A % B);
}
