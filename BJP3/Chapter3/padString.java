/*
Write a method padString that accepts two parameters: a String and an integer representing a length. The method should pad the parameter string with spaces until its length is the given length. For example, padString("hello", 8) should return "   hello". (This sort of method is useful when trying to print output that lines up horizontally.) If the string's length is already at least as long as the length parameter, your method should return the original string. For example, padString("congratulations", 10) would return "congratulations".
*/

public static String padString(String x, int n) {
    int len=x.length();
    if (n <= len)
	return(x);

    for (int i=0; i<(n-len); i++) {
	x = " " + x;
    }
    return(x);
}
