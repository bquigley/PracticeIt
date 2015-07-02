/*


Modify the preceding wordWrap method into a new wordWrap3 method that wraps only whole words, never chopping a word in half. Assume that a word is any whitespace-separated token and that all words are under 60 characters in length. Make sure that each time you wrap a line, the subsequent wrapped line(s) each begin with a word and not with any leading whitespace. Accept only a single parameter for the input Scanner, and send your method's output to the console, as in the original wordWrap problem; do not use an output file as was done in wordWrap2.

 */

public void wordWrap3(Scanner in) {
    int max_length = 60;
    String line;
    String tmp;
    int i;
    while(in.hasNextLine()) {
	line = in.nextLine();
	while (line.length() > max_length) {
	    tmp = line.substring(0, max_length);
	    line = line.substring(max_length);
	    i = max_length -1;
	    while(tmp.charAt(i) != ' ' && line.charAt(0) != ' ') {
		line = tmp.charAt(i) + line;
		tmp = tmp.substring(0, i);
		i--;
	    }
	    if (tmp.charAt(0) == ' ') {
		tmp = tmp.substring(1);
	    }
	    System.out.println(tmp);
	    
	}

	System.out.println(line);
    }
}
