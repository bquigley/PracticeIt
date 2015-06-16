/*


Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power. For example, the call pow(3, 4) returns 3 * 3 * 3 * 3 or 81. Do not use Math.pow in your solution. Assume that the base and exponent are non-negative.
*/

public static int pow(int base, int exponent) {
    int res = 1;
    for (int i=0; i<exponent; i++) {
	res *= base;
    }
    return res;
}
