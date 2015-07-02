/*


Write a method named printDuplicates that accepts as its parameter a Scanner for an input file containing a series of lines. Your method should examine each line looking for consecutive occurrences of the same token on the same line and print each duplicated token along how many times it appears consecutively. Non-repeated tokens are not printed. Repetition across multiple lines (such as if a line ends with a given token and the next line starts with the same token) is not considered in this problem.

For example, if the input file contains the following text:

hello how how are you you you you
I I I am Jack's Jack's smirking smirking smirking smirking smirking revenge
   bow  wow wow yippee yippee   yo yippee   yippee yay  yay yay
one fish two fish red fish blue fish
It's the Muppet Show, wakka wakka wakka

Your method would produce the following output for the preceding input file:

how*2 you*4
I*3 Jack's*2 smirking*5
wow*2 yippee*2 yippee*2 yay*3

wakka*3

Your code prints only the repeated tokens; the ones that only appear once in a row are not shown. Your code should place a single space between each reported duplicate token and should respect the line breaks in the original file. This is why a blank line appears in the expected output, corresponding to the fourth line of the file that did not contain any consecutively duplicated tokens. You may assume that each line of the file contains at least 1 token of input.
*/


public void printDuplicates(Scanner in) {
    Scanner line;
    String out_line ="";
    String current_word;
    String previous_word="";
    int n=0;
    boolean duplicated = false;
    while (in.hasNextLine()) {
	line = new Scanner(in.nextLine());
	while(line.hasNext()) {
	    current_word = line.next();
	    if (current_word.equals(previous_word)) {
		if (duplicated == false) {
		    n = 1;
		    out_line += current_word;
		    duplicated = true;
		}
		n++;
	    } else {
		if (duplicated) {
		    out_line += "*" + n + " ";
		    duplicated = false;
		}
	    }
	    previous_word = current_word;
	}
	
	if (duplicated) {
	    out_line += "*" + n + " ";
	}
	
	System.out.println(out_line);
	out_line = "";
	duplicated = false;
    }    
}
