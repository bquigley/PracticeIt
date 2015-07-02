/* Write a method named inputStats that takes a Scanner representing a file as a parameter and that reports various statistics about the file's text. In particular, your method should report the number of lines in the file, the longest line, the number of tokens on each line, and the length of the longest token on each line. You may assume that the input file has at least one line of input and that each line has at least one token. For example, if a Scanner named input on file carroll.txt contains the following text:

"Beware the Jabberwock, my son,
the jaws that bite, the claws that catch,
Beware the JubJub bird and shun
the frumious bandersnatch."

then the call inputStats(input); should produce the following output:

Line 1 has 5 tokens (longest = 11)
Line 2 has 8 tokens (longest = 6)
Line 3 has 6 tokens (longest = 6)
Line 4 has 3 tokens (longest = 14)
Longest line: the jaws that bite, the claws that catch,
*/

public void inputStats(Scanner in) {
    String longest_line="";
    int line_idx = 1;
    while(in.hasNextLine()) {
	String line_string = in.nextLine();
	Scanner line = new Scanner(line_string);
	int n_token = 0;
	int longest_length=0;
	while (line.hasNext()) {
	    String word = line.next();
	    n_token++;
	    if (longest_length < word.length()) {
		longest_length = word.length();
	    }
	}
	System.out.printf("Line %d has %d tokens (longest = %d)\n", line_idx, n_token, longest_length);
	line_idx++;
	if (longest_line.length() < line_string.length()) {
	    longest_line = line_string;
	}
    }
    System.out.println("Longest line: " + longest_line);
}
