/*
Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
*/

public static int largestAbsVal(int x, int y, int z) {
    int max = Math.abs(x);
    y = Math.abs(y);
    z = Math.abs(z);
    if (max < y) {
	max = y;
    }
    if (max < z) {
	max = z;
    }
    return(max);
}
