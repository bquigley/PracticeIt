/*
 Add the following method to the BankAccount class:

public String toString()

Your method should return a string that contains the account's name and balance separated by a comma and space. For example, if an account object named benben has the name "Benson" and a balance of 17.25, the call of benben.toString() should return:

Benson, $17.25

There are some special cases you should handle. If the balance is negative, put the - sign before the dollar sign. Also, always display the cents as a two-digit number. For example, if the same object had a balance of -17.5, your method should return:

Benson, -$17.50

Your code is being added to the following class:

public class BankAccount {
    private String name;
    private double balance;
    
    // your code goes here
    
}
*/

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
	public String name;
	public double balance;

	public final void deposit(double amount) {
		balance = balance + amount;
	}

	public final void withdraw(double amount) {
		balance = balance - amount;
	}
	
// YOUR CODE GOES HERE
	public String toString(){
		String res = name + ", ";
		if (balance < 0)
			res += "-";

		double bb = Math.abs(balance);
		DecimalFormat df = new DecimalFormat("0.00");
		res += "$" + df.format(bb);
		return res;
	}
}

