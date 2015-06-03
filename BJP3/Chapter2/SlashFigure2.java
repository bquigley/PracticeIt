/*
 Modify the SlashFigure program from the previous exercise to produce a new program SlashFigure2 that uses a global constant for the figure's height. The previous output used a constant height of 6. Here is the outputs for a constant height of 4 and 7 respectively: (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)
size 4 	size 7

!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

	

!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////
*/


public class SlashFigure2 {
    public static final int SIZE = 4;
    
    public static void main(String[] args) {
	//    number of ! = A * line + (D * SIZE + E)
	final int A = -4, B= 26, C=18, D=4, E=2;
	
	for (int i=1; i<=SIZE; i++) {
	    int nSlash = A * (1-i)/2;
	    int n = A * i + (D * SIZE + E);
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
