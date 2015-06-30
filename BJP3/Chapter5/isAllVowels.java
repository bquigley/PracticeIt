/*



Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u, case-insensitively). If every character of the String is a vowel, your method should return true. If any character of the String is a non-vowel, your method should return false. Your method should return true if passed the empty string, since it does not contain any non-vowel characters.

For example, here are some calls to your method and their expected results:
Call 	Value Returned
isAllVowels("eIEiO") 	true
isAllVowels("oink") 	false

*/


public boolean isAllVowels(String x) {
    x = x.toLowerCase();
    char y;
    
    for (int i=0; i<x.length(); i++) {
	y = x.charAt(i);
	if (y == 'a' ||
	    y == 'e' ||
	    y == 'i' ||
	    y == 'o' ||
	    y == 'u') {
	    continue;
	} else {
	    return false;
	}
    }
    return true;
}
