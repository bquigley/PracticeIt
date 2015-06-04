/*


Modify your StarFigure code from the previous problem to use a constant for the size. The outputs below use a constant size of 3 (left) and 6 (right):
size 3 	size 6

////////\\\\\\\\
////********\\\\
****************

	

////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

(You must solve this problem using only ONE public static final constant, not multiple constants; and its value must be used in the way described in this problem.)

*/


public class StarFigure2 {
    public static final int SIZE=3;
    
    public static void main(String[] args) {
	int n, k;
	for (int i=1; i<=SIZE; i++) {
	    n = 4 * (SIZE-i);
	    k = (SIZE-1)*8 - 2*n;
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
