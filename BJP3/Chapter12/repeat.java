/*


Write a recursive method repeat that accepts a string s and an integer n as parameters and that returns a String consisting of n copies of s. For example:
Call 	Value Returned
repeat("hello", 3) 	"hellohellohello"
repeat("this is fun", 1) 	"this is fun"
repeat("wow", 0) 	""
repeat("hi ho! ", 5) 	"hi ho! hi ho! hi ho! hi ho! hi ho! "

You should solve this problem by concatenating String objects using the + operator. String concatenation is an expensive operation, so it is best to minimize the number of concatenation operations you perform. For example, for the call repeat("foo", 500), it would be inefficient to perform 500 different concatenation operations to obtain the result. Most of the credit will be awarded on the correctness of your solution independent of efficiency. The remaining credit will be awarded based on your ability to minimize the number of concatenation operations performed.

Your method should throw an IllegalArgumentException if passed any negative value for n. You are not allowed to construct any structured objects other than Strings (no array, List, Scanner, etc.) and you may not use any loops to solve this problem; you must use recursion.
*/

public String repeat(String str, int n) {
    if (n < 0)
	throw new IllegalArgumentException();
    if (n == 0)
	return "";

    String half = repeat(str, n/2);

    if (n % 2 == 0)
	return half + half;

    return str + half + half;
}


