/*


Write for loops to produce the following output, with each line 40 characters wide:

----------------------------------------
_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-_-^-
1122334455667788990011223344556677889900
----------------------------------------

*/

public class waveNumbers40 {
    public static void main(String[] args) {
	for (int k=0; k<40; k++) {
	    System.out.print("-");
	}
	System.out.println();
	
	for (int i=1; i<=10; i++) {
	    System.out.print("_-^-");
	}
	System.out.println();
	
	for (int k=0; k<2; k++) {
	    for (int i=1; i<=10; i++) {
		if (i==10) {
		    System.out.print("00");
		} else {
		    System.out.print(i);
		    System.out.print(i);
		}
	    }
	}
	System.out.println();
	
	for (int k=0; k<40; k++) {
	    System.out.print("-");
	}
	System.out.println();
	
    }
}
