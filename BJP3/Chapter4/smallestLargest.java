/*


Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user. You may assume the user enters a valid number greater than 0 for the number of numbers to read. Here is an example dialogue:

How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11

*/

public static void smallestLargest() {
    Scanner in = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int n = in.nextInt();
    int[] nums = new int[n];
    for (int i=0; i<n; i++) {
	System.out.print("Number " + (i+1) +": ");
	nums[i] = in.nextInt();
    }

    int smallest = nums[0];
    int largest = nums[0];
    for (int i=1; i<n; i++) {
	if (nums[i] > largest) {
	    largest = nums[i];
	}
	if (nums[i] < smallest) {
	    smallest = nums[i];
	}
    }
    System.out.println("Smallest = " + smallest);
    System.out.println("Largest = " + largest);
}
