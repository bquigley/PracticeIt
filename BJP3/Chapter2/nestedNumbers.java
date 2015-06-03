/*


Write nested for loops that produce the following output:

000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

*/

public class nestedNumbers {
    public static void main(String[] args) {
	for (int i=0; i<3; i++) {
	    for (int j=0; j<10; j++) {
		for (int k=0; k<3; k++) {
		    System.out.print(j);
		}
	    }
	    System.out.println();
	}
    }
}
