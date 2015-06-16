/*

Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers. You may assume that the user types at least one non-negative even integer.

how many integers? 4
next integer? 2
next integer? 9
next integer? 18
next integer? 4
even sum = 24
even max = 18

*/

public static void evenSum() {
    Scanner in = new Scanner(System.in);
    System.out.print("how many integers? ");
    int n = in.nextInt();
    int[] nums = new int[n];
    for (int i=0; i<n; i++) {
	System.out.print("next integer? ");
	nums[i] = in.nextInt();
    }

    int sum = 0;
    int max = Integer.MIN_VALUE;
    
    for (int i=0; i<n; i++) {
	if (nums[i] % 2 == 0) {
	    if (max < nums[i]) {
		max = nums[i];
	    }
	    sum += nums[i];
	}
    }
    System.out.println("even sum = " + sum);
    System.out.println("even max = " + max);
}
