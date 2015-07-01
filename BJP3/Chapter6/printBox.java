/*


Write a method named printBox that accepts two parameters: a Scanner representing an input file, and an integer representing the length of the longest line of input in that file. Your method should print the contents of the file to the console, but print them inside a box figure. For example, if the file example.txt contains the following input data:

This is some
text here.

Then the following would be the output of your method, when passed a Scanner on that file and the integer 12 as parameters:

+--------------+
| This is some |
| text here.   |
+--------------+


 */

public void printBox(Scanner in, int n) {
   String h = "+-";
    for (int i=0; i<n; i++) {
      h += "-";   
    }
    h += "-+";
    
    System.out.println(h);
    String line;
    while(in.hasNextLine()){
        line = in.nextLine();
        System.out.print("| " + line);
        for (int i=0; i < (n-line.length()); i++) {
            System.out.print(" ");   
        }
        System.out.println(" |");
    }
    System.out.println(h);
}
