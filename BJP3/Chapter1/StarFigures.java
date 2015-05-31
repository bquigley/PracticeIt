/*

Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *

 */

public class StarFigures{
    public static void main(String[] args) {
	separater();
	star();
	blank();
	separater();
	star();
	separater();
	blank();
	vline();
	separater();
	star();
    }

    private static void separater() {
	System.out.println("*****");
	System.out.println("*****");
    }
    
    private static void star() {
	System.out.println(" * *");
	System.out.println("  *");
	System.out.println(" * *");
    }

    private static void vline() {
	for (int i=0; i<3; i++) {
	    System.out.println("  *");
	}
    }
    
    private static void blank() {
	System.out.println("");
    }
}
