/*
What is the decimal equivalent of each of the following binary numbers?
*/

public class binary2 {
    public static void main(String[] args) {
	int [] nums = {100, 1011, 101010, 1001110};
	for (int x: nums) {
	    toDecimal(x);
	}
    }

    private static void toDecimal(int num) {
	if (num == 0) {
	    System.out.println(0);
	}
	int res = 0;
	int p = 1;
	while (num != 0) {
	    res += (num % 10) * p;
	    p *= 2;
	    num /= 10;
	}
	System.out.println(res);
    }
}
