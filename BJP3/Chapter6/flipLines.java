/*



Write a method named flipLines that accepts as its parameter a Scanner for an input file and that writes to the console the same file's contents with successive pairs of lines reversed in order. For example, if the input file contains the following text:

Twas brillig and the slithy toves
did gyre and gimble in the wabe.
All mimsey were the borogroves,
and the mome raths outgrabe.

"Beware the Jabberwock, my son,
the jaws that bite, the claws that catch,
Beware the JubJub bird and shun
the frumious bandersnatch."

The program should print the first pair of lines in reverse order, then the second pair in reverse order, then the third pair in reverse order, and so on. Therefore your method should produce the following output to the console:

did gyre and gimble in the wabe.
Twas brillig and the slithy toves
and the mome raths outgrabe.
All mimsey were the borogroves,
"Beware the Jabberwock, my son,

Beware the JubJub bird and shun
the jaws that bite, the claws that catch,
the frumious bandersnatch."

Notice that a line can be blank, as in the third pair. Also notice that an input file can have an odd number of lines, as in the one above, in which case the last line is printed in its original position. You may not make any assumptions about how many lines are in the Scanner.
*/

public void flipLines(Scanner in) {
    String line1, line2;
    while (in.hasNextLine()) {
	line1 = in.nextLine();
	if (in.hasNextLine()) {
	    line2 = in.nextLine();
	    System.out.println(line2);
	}
	System.out.println(line1);
    }

}
