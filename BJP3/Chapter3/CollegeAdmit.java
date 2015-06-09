/*


(NOTE: This problem probably should have been put into Chapter 4 because its solution uses if/else statements, which are not taught until Ch. 4. We are leaving it here in Practice-It to be consistent with the textbook, but the problem will probably be moved in a future edition of the book.)

Write a complete program in a class named CollegeAdmit that uses a Scanner to read user input for a student's grade point average and SAT exam score, and uses these values to decide whether the student is admitted to the university. A GPA below 1.8 will cause the student to be rejected; an SAT score below 900 will also cause a rejection. Otherwise the student is accepted. If both the GPA and the SAT score are too low, print the message about the GPA being too low. Your output should match the following examples:

University admission program
What is your GPA? 3.2
What is your SAT score? 1280
You were accepted!

University admission program
What is your GPA? 3.95
What is your SAT score? 860
Your SAT score is too low.

University admission program
What is your GPA? 1.4
What is your SAT score? 1590
Your GPA is too low.

*/

public class CollegeAdmit{
    public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.println("University admission program");
	System.out.print("What is your GPA? ");
	double gpa = console.nextDouble();
	System.out.print("What is your SAT score? ");
	int sat = console.nextInt();
	if (gpa < 1.8) {
	    System.out.println("Your GPA is too low.");
	} else if (sat < 900) {
	    System.out.println("Your SAT score is too low.");
	} else {
	    System.out.println("You were accepted!");
	}
    }
}
   
