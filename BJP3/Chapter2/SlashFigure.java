/*



Write a Java program in a class named SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure. (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

*/

public class SlashFigure {
    public static void main(String[] args) {
	
	//  number of \ = A * line + B
	//  number of ! = C * line + D

	final int A = 2, B= -2, C=-4, D=26;

	for (int i=1; i<=6; i++) {
	    int nSlash = A * i + B;
	    int n = C * i + D;
	    for (int j=0; j < nSlash; j++) {
		System.out.print("\\");
	    }
	    for (int j=0; j<n; j++) {
		System.out.print("!");
	    }
	    for (int j=0; j < nSlash; j++) {
		System.out.print("/");
	    }
	    System.out.println();
	}
    }

}
