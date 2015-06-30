
/*
Write a method named diceSum that prompts the user for a desired sum, then repeatedly rolls two six-sided dice until their sum is the desired sum. Here is the expected dialogue with the user:

Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9

(Because this problem uses random numbers, our test cases check only the general format of your output. You must still examine the output yourself to make sure the answer is correct.)
*/

public void diceSum() {
    Scanner in = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int n = in.nextInt();

    Random ran = new Random();
    int x, y, sum;
    do {
	x = ran.nextInt(6) +1;
	y = ran.nextInt(6) +1;
	sum = x + y;
	System.out.println(x + " and " + y + " = " + sum);
    } while (sum != n);
    
}
