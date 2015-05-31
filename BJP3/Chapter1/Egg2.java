/*

Write a complete Java program in a class named Egg2 that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
  _______
 /       \
/         \
\         /
 \_______/
-"-'-"-'-"-
\         /
 \_______/
  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/

*/

public class Egg2 {
    public static void main(String[] args) {
	upper_part();
	lower_part();
	middle();
	upper_part();
	lower_part();
	middle();
	lower_part();
	upper_part();
	middle();
	lower_part();
    }
    private static void upper_part() {
	System.out.println("  _______");
	System.out.println(" /       \\");
	System.out.println("/         \\");
    }
    private static void middle() {
	System.out.println("-\"-'-\"-'-\"-");
    }
    private static void lower_part() {
	System.out.println("\\         /");
	System.out.println(" \\_______/");
    }
}

