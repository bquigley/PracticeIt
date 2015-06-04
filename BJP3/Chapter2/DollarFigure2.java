
/*

Modify your DollarFigure program from the previous exercise to become a new program called DollarFigure2 that uses a global constant for the figure's height. (You may want to make loop tables first.) The previous output used a constant height of 7. The outputs below use a constant size of 3 (left) and 5 (right):
size 3 	size 5

$$$******$$$
**$$****$$**
****$**$****

	

$$$$$**********$$$$$
**$$$$********$$$$**
****$$$******$$$****
******$$****$$******
********$**$********

(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)

*/



public class DollarFigure2 {
    public static final int SIZE = 3;
    public static void main(String[] args) {
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

