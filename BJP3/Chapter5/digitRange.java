/*


Write a method named digitRange that accepts an integer as a parameter and returns the range of values of its digits. The range is defined as 1 more than the difference between the largest and smallest digit value. For example, the call of digitRange(68437) would return 6 because the largest digit value is 8 and the smallest is 3, so 8 - 3 + 1 = 6. If the number contains only one digit, return 1. You should solve this problem without using a String.

*/

public int digitRange(int n) {
    n = Math.abs(n);
    if (n < 10) {
	return 1;
    }

    int min= n % 10;
    int max= min;
    int last;
    
    while(n>0) {
	last = n % 10;
	if (last < min) {
	    min = last;
	}
	if (last > max) {
	    max = last;
	}
	
	n /= 10;
    }
    return max-min+1;
}
