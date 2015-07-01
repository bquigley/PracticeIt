/*
Write a complete Java program that prints itself to the console as output. 
Assume that the program is stored in a file named PrintMyself.java, 
and make your code open the file PrintMyself.java and print its contents to the console.
*/

public class PrintMyself{
    public static void main(String[] args) throws FileNotFoundException{
	Scanner class_content = new Scanner(new File("PrintMyself.java"));
	String line;
	while (class_content.hasNextLine()) {
	    line = class_content.nextLine();
	    System.out.println(line);
	}
    }

}
