/*Write a method called swapPairs that accepts a String as a parameter and returns that String with each pair of adjacent letters reversed. If the String has an odd number of letters, the last letter is unchanged. For example, the call swapPairs("example") should return "xemalpe" and the call swapPairs("hello there") should return "ehll ohtree". 
 */

public String swapPairs(String x) {
    String res="";
    int i=0;
    while (i<x.length()-1) {
	res += x.charAt(i+1);
	res += x.charAt(i);
	i += 2;
    }
    if ( i == x.length() -1) {
	res += x.charAt(i);
    }
    return res;
}
