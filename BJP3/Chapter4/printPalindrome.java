/*


Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the same forwards as it does backwards, like "abba" or "racecar"). If the following Scanner object were declared:

Scanner console = new Scanner(System.in);
printPalindrome(console);

The resulting output for a call where the user types a palindrome would be:

Type one or more words: racecar
racecar is a palindrome!

The output for a call where the user types a word that is not a palindrome would be:

Type one or more words: hello
hello is not a palindrome.

For an added challenge, make the code case-insensitive, so that words like "Abba" and "Madam" will be considered palindromes.

*/

public void printPalindrome(Scanner console) {
    System.out.print("Type one or more words: ");
    String word = console.next();
    String word2 = word.toLowerCase();
    int n = word.length();
    boolean isPalindrome = true;
    for (int i=0; i<n/2; i++) {
	if (word2.charAt(i) != word2.charAt(n-1-i)) {
	    isPalindrome = false;
	    break;
	}
    }
    System.out.println();
    if(isPalindrome) {
	System.out.println(word + " is a palindrome!");
    } else {
	System.out.println(word + " is not a palindrome.");
    }
}
