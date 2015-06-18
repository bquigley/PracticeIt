/*
  Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer exponent as parameters and returns the base raised to the given power. Your code should work for both positive and negative exponents. For example, the call pow2(2.0, -2) returns 0.25. Do not use Math.pow in your solution. */

public double pow2(double x, int e) {
    boolean negative = false;
    if (e < 0) {
	negative = true;
	e = -1 * e;
    }
    double res=1.0;
    for (int i=0; i<e; i++) {
	res *= x;
    }
    if (negative) {
	res = 1.0/res;
    }
    return res;
}
