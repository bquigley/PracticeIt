/*
  Write a method named readEntireFile that accepts a Scanner representing an input file as its parameter, then reads that file and returns the entire text contents of that file as a String. */

public String readEntireFile(Scanner in) {
    String content ="";
    while (in.hasNextLine()) {
	content += in.nextLine();
	content += "\n";
    }
    return content;
}
