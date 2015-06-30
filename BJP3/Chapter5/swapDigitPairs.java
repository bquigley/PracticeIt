/*


Write a method named swapDigitPairs that accepts an integer n as a parameter and returns a new integer whose value is similar to n's but with each pair of digits swapped in order. For example, the call of swapDigitPairs(482596) would return 845269. Notice that the 9 and 6 are swapped, as are the 2 and 5, and the 4 and 8. If the number contains an odd number of digits, leave the leftmost digit in its original place. For example, the call of swapDigitPairs(1234567) would return 1325476. You should solve this problem without using a String.

*/

public int swapDigitPairs(int n) {
    int len=0;
    int x = n;
    while (n > 0) {
	n /= 10;
	len++;
    }
    n = x;
    
    int[] num = new int[len];

    while(n > 0) {
	num[--len] = n % 10;
	n /=10;
    }
    int tmp;
    for (int i=num.length -1; i>0; i = i-2) {
	tmp = num[i];
	num[i] = num[i-1];
	num[i-1] = tmp;
    }

    int y = 0;
    for (int i=0; i< num.length; i++) {	
	y = y * 10 + num[i]; 
    }
    return y;
}
