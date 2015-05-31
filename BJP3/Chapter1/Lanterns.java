/*

Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****

    */

public class Lanterns{
    public static void main(String[] args) {
	triple();
	blank();
	triple();
	vline();
	line3();
	triple();
	blank();
	triple();
	line1();
	vline();
	vline();
	line1();
	line1();
    }

    private static void line1() {
	System.out.println("    *****");
    }
    private static void line3() {
	System.out.println("*************");
    }

    private static void triple() {
	line1();
	System.out.println("  *********");
	line3();
    }

    private static void vline() {
	System.out.println("* | | | | | *");
    }
    
    private static void blank() {
	System.out.println("");
    }
}
