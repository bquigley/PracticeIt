/*


Write a static method named vowelCount that accepts a String as a parameter and produces and returns an array of integers representing the counts of each vowel in the String. The array returned by your method should hold 5 elements: the first is the count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us. Assume that the string contains no uppercase letters.

For example, the call vowelCount("i think, therefore i am") should return the array {1, 3, 3, 1, 0}.
*/

public int[] vowelCount(String x) {
    int[] res = new int[5];
    for (int i=0; i<x.length(); i++) {
	char ch = x.charAt(i);
	if (ch == 'a') {
	    res[0]++;
	} else if (ch == 'e') {
	    res[1]++;
	} else if (ch == 'i') {
	    res[2]++;
	} else if (ch == 'o') {
	    res[3]++;
	} else if (ch == 'u') {
	    res[4]++;
	}
    }
    return res;
}
