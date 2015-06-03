/*


Modify your code from the previous problem to produce the following output:

99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000
99999888887777766666555554444433333222221111100000

*/

public class nestedNumbers2 {
    public static final int REP = 5;
    
    public static void main(String[] args) {
	for (int i=0; i<REP; i++) {
	    for (int j=9; j>=0; j--) {
		for (int k=0; k<REP; k++) {
		    System.out.print(j);
		}
	    }
	    System.out.println();
	}
    }
}
