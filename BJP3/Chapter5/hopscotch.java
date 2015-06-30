/*


Write a method named hopscotch that accepts an integer parameter for a number of "hops" and prints a hopscotch board of that many hops. A "hop" is defined as the split into two numbers and then back together again into one. For example, hopscotch(3); should print:

   1
2     3
   4
5     6
   7
8     9
   10

*/

public void hopscotch(int n) {
    int x=0;
    for (int i=0; i< n; i++) {
	System.out.println("   " + (++x));
	System.out.println((++x) + "     " + (++x));
    }
    System.out.println("   " + (++x));
}
