/*


Write for loops to produce the following output:

1
22
333
4444
55555
666666
7777777

*/

public class numberTriangle {
    public static void main(String[] args) {
	for (int i=1; i<=7; i++) {
	    for (int j=0; j<i; j++) {
		System.out.print(i);
	    }
	    System.out.println();
	}
    }
}
