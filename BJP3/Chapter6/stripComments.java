// Write a method called stripComments that accepts a Scanner representing an input file containing a Java program as its parameter, reads that file, and then prints the file's text with all comments removed. A comment is any text on a line from // to the end of the line, and any text between /* and */ characters. For example, consider the following text:

// import java.util.*;

// /* My program
// by Suzy Student */
// public class Program {
//     public static void main(String[] args) {
//         System.out.println("Hello, world!"); // a println
//     }

//     public static /* Hello there */ void foo() {
//         System.out.println("Goodbye!"); // comment here
//     } /* */
// }

// If the file contained this text, your program should output the following text:

// import java.util.*;


// public class Program {
//     public static void main(String[] args) {
//         System.out.println("Hello, world!");
//     }

//     public static  void foo() {
//         System.out.println("Goodbye!");
//     }
// }



public void stripComments(Scanner in) {
    String content="";
    while (in.hasNextLine()) {
	content += in.nextLine();
	content += "\n"; // is one character, not 2
    }

    String res="";
    boolean is_comment_1; // //
    boolean is_comment_2; // /* */
    
    if (content.substring(0, 2).equals("//")) {
	is_comment_1 = true;
    } else {
	is_comment_1 = false;
    }

    if (content.substring(0, 2).equals("/*")) {
	is_comment_2 = true;
    } else {
	is_comment_2 = false;
    }
    
    for (int i=0; i<content.length()-1; i++) {
	if (is_comment_1) {
	    if (content.substring(i, i+1).equals("\n")) {
		is_comment_1 = false;
		res += content.charAt(i);
	    } 
	    continue;
	} else if (is_comment_2) {
	    if (content.substring(i, i+2).equals("*/")) {
		is_comment_2 = false;
		i++;
	    }
	    continue;
	} else {
	    if (content.substring(i, i+2).equals("//")) {
		is_comment_1 = true;
	    } else if (content.substring(i, i+2).equals("/*")) {
		is_comment_2 = true;
	    } else {
		res += content.charAt(i);
	    }
	}
    }
    System.out.println(res);
}

    
