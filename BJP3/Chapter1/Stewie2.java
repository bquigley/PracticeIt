/*


Write a complete Java program in a class named Stewie2 that prints the following output. Use at least one static method besides main to remove redundancy.

//////////////////////
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\
|| Victory is mine! ||
\\\\\\\\\\\\\\\\\\\\\\

*/

public class Stewie2 {
    public static void main(String[] args) {
	print_header();
	for (int i=0; i<5; i++) {
	    msg();
	}
    }

    private static void print_header() {
	System.out.println("//////////////////////");
    }

    private static void print_separator() {
	System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    private static void msg() {
	System.out.println("|| Victory is mine! ||");
	print_separator();
    }
}
