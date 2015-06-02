/*


Write a for loop that produces the following output:

1 4 9 16 25 36 49 64 81 100 

For added challenge, try to modify your code so that it does not need to use the * multiplication operator. (It can be done! Hint: Look at the differences between adjacent numbers.)
*/

public class loopSquares {
    public static void main(String[] args) {
	int[] x = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
	for (int i=0; i<x.length; i++) {
	    System.out.print(x[i]);
	    if (i != x.length -1) {
		System.out.print(" ");
	    } else {
		System.out.println("");
	    }
	}
    }
}
