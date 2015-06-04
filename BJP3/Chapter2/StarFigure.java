/*


Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************

*/

public class StarFigure {
    public static void main(String[] args) {
	int n, k;
	for (int i=1; i<=5; i++) {
	    n = 4 * (5-i);
	    k = 32 - 2*n;
	    for (int j=0; j<n; j++) {
		System.out.print("/");
	    }
	    for (int j=0; j<k; j++) {
		System.out.print("*");
	    }
	    for (int j=0; j<n; j++) {
		System.out.print("\\");
	    }
	    System.out.println();
	}
    }
}
