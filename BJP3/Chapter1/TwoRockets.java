/*

Write a complete Java program in a class named TwoRockets that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

Note that there are two rocket ships next to each other. What redundancy can you eliminate using static methods? What redundancy cannot be eliminated?

   /\       /\
  /  \     /  \
 /    \   /    \
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
|United| |United|
|States| |States|
+------+ +------+
|      | |      |
|      | |      |
+------+ +------+
   /\       /\
  /  \     /  \
 /    \   /    \

*/

public class TwoRockets{
    public static void main(String[] args) {
	twoRockets();
    }

    public static void twoRockets() {
	head_tail();
	upper_lower_part();
	middle();
	upper_lower_part();
	head_tail();
    }


    private static void line1() {
	System.out.print("   /\\");
    }
    private static void line2() {
	System.out.print("  /  \\");
    }
    private static void line3() {
	System.out.print(" /    \\");
    }
    
    public static void head_tail() {
	line1();
	System.out.print("    ");
	line1();
	System.out.println("");
	line2(); 
	System.out.print("   ");
	line2();
	System.out.println("");
	line3();
	System.out.print("  ");
	line3();
	System.out.println("");
    }
    private static void separater_internal() {
	System.out.print("+------+");
    }
    private static void separater() {
	separater_internal();
	System.out.print(" ");
	separater_internal();
    }
    public static void upper_lower_part() {
	separater();
	System.out.println();
	for (int i=0; i<4; i++) {
	    System.out.print("|      |");
	    if (i % 2 == 0) {
		System.out.print(" ");
	    } else {
		System.out.println();
	    }
	}
	separater();
	System.out.println();
    }
    private static void middle_1() {
	System.out.print("|United|");
    }
    private static void middle_2() {
	System.out.print("|States|");
    }
    public static void middle() {
	middle_1();
	System.out.print(" ");
	middle_1();
	System.out.println();
	middle_2();
	System.out.print(" ");
	middle_2();
	System.out.println();
    }
}
