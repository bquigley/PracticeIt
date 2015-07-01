/*



In Self-Check 6.16, you are asked to write a method named printEntireFile that prompts the user for a file name and printed that file's contents to the console. Modify your code from that problem into a new method named printEntireFile2 that will repeatedly prompt until the user types the name of a file that exists on the system. If you like, you can call the method getFileName from Self-Check 6.20 (without rewriting or pasting it here) to help you solve this problem. For example, if the file example.txt contains the following input data:

hello  how    are you
1 2 3 4

I am fine

Then the following would be an example dialogue of your method:

Type a file name: bad.txt
Type a file name: not_here.txt
Type a file name: alsobad.txt
Type a file name: example.txt
hello  how    are you
1 2 3 4

I am fine

*/


public void printEntireFile2() {
    // function defined in self-check 6.20
    String filename = getFileName(); 
    Scanner in = new Scanner(new File(filename));
    while(in.hasNextLine()) {
	System.out.println(in.nextLine());
    }

}
