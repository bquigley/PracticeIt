/*


Modify the preceding wordWrap method into a new wordWrap2 method that accepts a second parameter for a PrintStream to write the data, and outputs the newly wrapped text to that PrintStream rather than to the console. Also, modify it to use a local variable to store the maximum line length rather than hard-coding 60. (You can go back to the last problem to copy your solution code from there and paste it here as a starting point.)

*/


public void wordWrap2(Scanner in, PrintStream out) {
    int max_length = 60;
    String line;
    while(in.hasNextLine()) {
	line = in.nextLine();
	while (line.length() > max_length) {
	    out.println(line.substring(0, max_length));
	    line = line.substring(max_length);
	}
	out.println(line);
    }
}
