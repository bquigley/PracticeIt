/*


Write a method dominant that accepts three integers as parameters and returns true if any one of the three integers is larger than the sum of the other two integers. The integers might be passed in any order, so the largest value could be any of the three. If no value is larger than the sum of the other two, your method should return false.

For example, the call of dominant(4, 9, 2) would return true because 9 is larger than 4 + 2. The call of dominant(5, 3, 7) would return false because none of those three numbers is larger than the sum of the others. You may assume that none of the numbers is negative.

*/

public boolean dominant(int x, int y, int z) {
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

    return num[2] > (num[1]+num[0]);
}
