/*
  Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs each line of the file to the console, word-wrapping all lines that are longer than 60 characters. For example, if a line contains 112 characters, the method should replace it with two lines: one containing the first 60 characters and another containing the final 52 characters. A line containing 217 characters should be wrapped into four lines: three of length 60 and a final line of length 37. */


public void wordWrap(Scanner in) {
    String line;
    while(in.hasNextLine()) {
	line = in.nextLine();
	while (line.length() > 60) {
	    System.out.println(line.substring(0, 60));
	    line = line.substring(60);
	}
	System.out.println(line);
    }
}
