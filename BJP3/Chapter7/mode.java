/*


Write a method called mode that returns the most frequently occurring element of an array of integers. Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.

For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15. (Hint: You may wish to look at the Tally program from earlier in this chapter to get an idea of how to solve this problem.)
*/

public int mode(int[] data) {
    int[] count = new int[101];
    for (int x: data) {
	count[x]++;
    }
    int max=count[0];
    int index = 0;
    for (int i=1; i<count.length; i++) {
	if (count[i] > max) {
	    max = count[i];
	    index = i;
	}
    }
    return index;
}
