/*


Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-

*/

public class printDesign {
    public static void main(String[] args) {
	printDesign();
    }
    
    public static void printDesign() {
	for (int i=1; i<=5; i++) {
	    for (int j=i; j<6; j++) {
		System.out.print("-");
	    }
	    for (int k=0; k<2*i-1; k++) {
		System.out.print(2*i-1);
	    }
	    for (int j=i; j<6; j++) {
		System.out.print("-");
	    }
	    System.out.println();
	}
    
    }
}
