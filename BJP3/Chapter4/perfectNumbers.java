/*


A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 1 but not the number itself). The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28. Write a static method perfectNumbers that takes an integer max as an argument and prints out all perfect numbers that are less than or equal to max.

Here is the console output from a call to perfectNumbers(6):

Perfect numbers up to 6: 6 

Here is the console output from a call to perfectNumbers(500):

Perfect numbers up to 500: 6 28 496 

*/

public static void perfectNumbers(int n) {
    System.out.print("Perfect numbers up to " + n + ": ");
    for (int i=2; i<=n; i++) {
	if (isPerfectNumber(i)) {
	    System.out.print(i + " ");
	}
    }
    System.out.println();
}

public static boolean isPerfectNumber(int n) {
    int x = (int) Math.sqrt(n);
    int sum = 1;
    for (int i=2; i<=x; i++) {
	if (n % i == 0) {
	    sum += i + n/i;
	}
    }
    if (sum == n) {
	return true;
    }
    return false;
}
