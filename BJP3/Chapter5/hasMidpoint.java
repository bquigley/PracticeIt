/*



Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers is the midpoint between the other two integers; that is, if one integer is exactly halfway between them. Your method should return false if no such midpoint relationship exists.

The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd. You must check all cases.

Calls such as the following should return true:

hasMidpoint(4, 6, 8)
hasMidpoint(2, 10, 6)
hasMidpoint(8, 8, 8)
hasMidpoint(25, 10, -5)

Calls such as the following should return false:

hasMidpoint(3, 1, 3)
hasMidpoint(1, 3, 1)
hasMidpoint(21, 9, 58)
hasMidpoint(2, 8, 16)

*/

public boolean hasMidpoint(int x, int y, int z) {
    int[] num = {x, y, z};
    int tmp;
    for (int i=0; i<num.length-1; i++) {
	for (int j=i+1; j < num.length; j++) {
	    if (num[i] > num[j]) {
		tmp =num[i];
		num[i] = num[j];
		num[j] = tmp;
	    }
	}
    }
    return (num[0]+num[2]) == (num[1] * 2);
}
