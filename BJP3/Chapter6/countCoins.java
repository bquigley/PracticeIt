/*


Write a method named countCoins that accepts as its parameter a Scanner for an input file whose data represents a person's money grouped into stacks of coins. Your method should add up the cash values of all the coins and print the total money at the end. The input consists of a series of pairs of tokens, where each pair begins with an integer and is followed by the type of coin, which will be either "pennies" (1 cent each), "nickels" (5 cents each), "dimes" (10 cents each), or "quarters" (25 cents each), case-insensitively. A given coin might appear more than once on the same line.

For example, if the input file contains the following text:

3 pennies 2 quarters 1 pennies 3 nickels 4 dimes

3 pennies are worth 3 cents, and 2 quarters are worth 50 cents, and 1 penny is worth 1 cent, and 3 nickels are worth 15 cents, and 4 dimes are worth 40 cents. The total of these is 1 dollar and 9 cents, therefore your method would produce the following output if passed this input data. Notice that the method should show exactly two digits after the decimal point, so it says 09 for 9 cents:

Total money: $1.09

Here is a second example. Suppose the input file contains the following text. Notice the capitalization and spacing:

12   QUARTERS      1   Pennies      33 
PeNnIeS      

  10    niCKELs

Then your method would produce the following output:

Total money: $3.84

You may assume that the file contains at least 1 pair of tokens. You may also assume that the input is valid; that the input has an even number of tokens, that every other token is an integer, and that the others are valid coin types.
*/

public void countCoins(Scanner in) {
    int sum = 0;
    int n = 0;
    String unit="";

    while(in.hasNext()) {
	if (in.hasNextInt()) {
	    n = in.nextInt();
	} else {
	    unit = in.next();
	    
	    unit = unit.toLowerCase();
	    if (unit.equals("pennies")) {
		sum += n;
	    } else if (unit.equals("nickels")) {
		sum += n * 5;
	    } else if (unit.equals("dimes")) {
		sum += n * 10;
	    } else if (unit.equals("quarters")){
		sum += n * 25;
	    } else {
		
	    }
	}
    }
    System.out.printf("Total money: $%.2f", 0.01 * sum);
}

