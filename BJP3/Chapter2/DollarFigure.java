/*

Write a Java program called DollarFigure that produces the following output. Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

*/

public class DollarFigure {
    public static void main(String[] args) {
	final int SIZE = 7;
	int LS, MS, RS, LD, RD;
	for(int i=0; i<SIZE; i++) {
	    LS = 2* i;
	    RS = LS;
	    LD = SIZE -i;
	    RD = LD;
	    MS = SIZE * 4 - LS - RS - LD - RD;
	    for (int j=0; j<LS; j++) {
		System.out.print("*");
	    }
	    for (int j=0; j<LD; j++) {
		System.out.print("$");
	    }
	    for (int j=0; j<MS; j++) {
		System.out.print("*");
	    }
	    for (int j=0; j<RD; j++) {
		System.out.print("$");
	    }
	    for (int j=0; j<RS; j++) {
		System.out.print("*");
	    }
	    System.out.println();
	}
    }
}
