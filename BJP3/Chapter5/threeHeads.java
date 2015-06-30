/*


Write a method named threeHeads that repeatedly flips a coin until three heads in a row are seen. You should use a Random object to give an equal chance to a head or a tail appearing. Each time the coin is flipped, what is seen is displayed (H for heads, T for tails). When 3 heads in a row are flipped a congratulatory message is printed. Here are possible outputs of two calls to threeHeads:

T T T H T H H H
Three heads in a row!

(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)
*/

public void threeHeads() {
    Random random = new Random();

    int nh = 0;
    while (nh < 3) {
	if (random.nextBoolean()) {
	    nh++;
	    System.out.print("H");
	    if (nh != 3) {
		System.out.print(" ");
	    }
	} else {
	    nh = 0;
	    System.out.print("T ");
	}
    }
    System.out.println();
    System.out.println("Three heads in a row!");
    
}
