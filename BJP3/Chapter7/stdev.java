/*



Write a method called stdev that returns the standard deviation of an array of integers. Standard deviation is computed by taking the square root of the sum of the squares of the differences between each element and the mean, divided by one less than the number of elements. (It's just that simple!)

More concisely and mathematically, the standard deviation of an array a is written as follows:
standard deviation

For example, if the array passed contains the values {1, -2, 4, -4, 9, -6, 16, -8, 25, -10}, your method should return approximately 11.237. You may assume that the array passed is non-null and contains at least two values, because the standard deviation is undefined otherwise.

(Note: you might fail the last two tests because of rounding, but as long as it's close, then your algorithm is probably correct.)
*/


public double stdev(int[] d) {
    double mu = 0;
    int n=d.length;
    for (int x: d) {
	mu += x;
    }
    mu /= n;

    double ss=0;
    for (int x: d) {
	ss += Math.pow((x-mu), 2);
    }
    return Math.sqrt(ss/(n-1));
}
