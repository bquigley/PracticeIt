/*
 Write a Java program in a class named Window that produces the preceding figure as output. Use nested for loops to print the repeated parts of the figure. Once you get it to work, add one class constant to your program so that the size of the figure can be changed simply by changing that constant's value. The example output shown is at a constant size of 3, but if you change the constant, the figure should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
*/



/* pseudocode

define horizontal_line = '+===+===+'

define method vertical_box:

print vertical line
for (k in 1:3) {
    for (i in 1:3) {
	print |
	for (j in 1:3) {
	    print ' '
	}
    }
    print newline
}

print horizontal_line
print vertical_box
print horizontal_line
print vertical_box
print horizontal_line

*/

public class Window{
    public static final int SIZE=3;
    public static void main(String[] args) {
	String hline = "+";
	for (int k=0; k<2; k++) {
	    for (int i=0; i<SIZE; i++) {
		hline += "=";
	    }
	    hline += "+";
	}

	for (int i=0; i<3; i++) {
	    System.out.println(hline);
	    if (i < 2) {
		print_vertical_box();
	    }
	}
    }
    
    public static void print_vertical_box() {
	for (int k=0; k<SIZE; k++) {
	    for (int i=0; i<3; i++) {
		System.out.print("|");
		if (i == 2 ) {
		    System.out.println();
		} else {
		    for (int j=0; j<SIZE; j++) {
			System.out.print(" ");
		    }
		}
	    }
	}
    }
}
