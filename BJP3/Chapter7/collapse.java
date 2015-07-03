/*



Write a method called collapse that accepts an array of integers as a parameter and returns a new array containing the result of replacing each pair of integers with the sum of that pair. For example, if an array called list stores the values {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}, then the call of collapse(list) should return a new array containing {9, 17, 17, 8, 19}. The first pair from the original list is collapsed into 9 (7 + 2), the second pair is collapsed into 17 (8 + 9), and so on. If the list stores an odd number of elements, the final element is not collapsed. For example, if the list had been {1, 2, 3, 4, 5}, then the call would return {3, 7, 5}. Your method should not change the array that is passed as a parameter.

*/

public int[] collapse(int[] d) {
    int n = d.length;
    int[] res = new int[(n+1)/2];
    int i=0;
    int j=0;
    while (i < n-1) {
	res[j] = d[i] + d[i+1];
	j++;
	i += 2;
    }
    if (i == n-1)
	res[j] = d[i];

    return res;
}
