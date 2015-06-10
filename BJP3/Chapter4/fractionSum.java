/*


Write a method called fractionSum that accepts an integer parameter n and returns as a double the sum of the first n terms of the sequence:

fraction sum equation

In other words, the method should generate the following sequence:

1 + (1/2) + (1/3) + (1/4) + (1/5) + ...

You may assume that the parameter n is non-negative.

*/

public static double fractionSum(int n) {
    double res = 0.0;
    for (int i=1; i<=n; i++) {
	res += 1.0/i;
    }
    return res;
}
