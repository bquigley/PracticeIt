/*


Modify your code from the previous problem to produce the following output:

999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

*/

public class nestedNumbers3 {    
    public static void main(String[] args) {
	for (int i=0; i<4; i++) {
	    for (int j=9; j>=0; j--) {
		for (int k=0; k<j; k++) {
		    System.out.print(j);
		}
	    }
	    System.out.println();
	}
    }
}
