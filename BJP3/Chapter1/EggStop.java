/*

Write a complete Java program in a class named EggStop that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

  ______
 /      \
/        \
\        /
 \______/

  ______
 /      \
/        \
\        /
 \______/
+--------+

  ______
 /      \
/        \
|  STOP  |
\        /
 \______/
+--------+

*/

public class EggStop{
    public static void main(String[] args) {
	upper();
	lower();
	blank();
	upper();
	lower();
	sep();
	blank();
	upper();
	stop();
	lower();
	sep();
    }
    
    private static void upper() {
	System.out.println("  ______");
	System.out.println(" /      \\");
	System.out.println("/        \\");
    }

    private static void stop() {
	System.out.println("|  STOP  |");
    }
    
    private static void lower() {
	System.out.println("\\        /");
	System.out.println(" \\______/");
    }

    private static void sep() {
	System.out.println("+--------+");
    }

    private static void blank() {
	System.out.println();
    }
}
