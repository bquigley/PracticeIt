/*
 Suppose that you are provided with a pre-written class BankAccount as shown below. (The headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.

Write an instance method named transfer that will be placed inside the BankAccount class to become a part of each BankAccount object's behavior. The transfer method moves money from this bank account to another account. The method accepts two parameters: a second BankAccount to accept the money, and a real number for the amount of money to transfer.

There is a $5.00 fee for transferring money, so this much must be deducted from the current account's balance before any transfer.

The method should modify the two BankAccount objects such that "this" current object has its balance decreased by the given amount plus the $5 fee, and the other BankAccount object's balance is increased by the given amount. A transfer also counts as a transaction on both accounts.

If this account object does not have enough money to make the full transfer, transfer whatever money is left after the $5 fee is deducted. If this account has under $5 or the amount is 0 or less, no transfer should occur and neither account's state should be modified.

// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
    private String id;
    private double balance;
    private int transactions;
    
    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String id)
    
    // returns the field values
    public double getBalance()
    public String getID()
    public String getTransactions()
    
    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount)
    
    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount)
    
    // your method would go here
}

For example, given the following BankAccount objects:

BankAccount ben = new BankAccount("Benson");
ben.deposit(90.00);
BankAccount mar = new BankAccount("Marty");
mar.deposit(25.00);

Assuming that the following calls were made, the balances afterward are shown in comments to the right of each call:

ben.transfer(mar, 20.00);     // ben $65, mar $45   (ben loses $25, mar gains $20)
ben.transfer(mar, 10.00);     // ben $50, mar $55   (ben loses $15, mar gains $10)
ben.transfer(mar, -1);        // ben $50, mar $55   (no effect; negative amount)
mar.transfer(ben, 39.00);     // ben $89, mar $11   (mar loses $44, ben gains $39)
mar.transfer(ben, 50.00);     // ben $95, mar $ 0   (mar loses $11, ben gains $ 6)
mar.transfer(ben,  1.00);     // ben $95, mar $ 0   (no effect; no money in account)
ben.transfer(mar, 88.00);     // ben $ 2, mar $88   (ben loses $93, mar gains $88)
ben.transfer(mar,  1.00);     // ben $ 2, mar $88   (no effect; can't afford fee)

*/

public class BankAccount {   // BankAccount template for Practice-It
	private String id;
	private double balance;
	private int transactions;
	private String transactionText;

	public BankAccount(String id) {
		this.id = id;
		balance = 0;
		transactions = 0;
		transactionText = "";
	}

	public double getBalance() {
		return balance;
	}

	public String getID() {
		return id;
	}

	public int getTransactionCount() {
		return transactions;
	}

	public String getTransactions() {
		return transactionText;
	}

	public void deposit(double amount) {
		if (0 <= amount && amount <= 500) {
			balance += amount;
			transactionText += "deposit of $" + amount + "\n";
		}
		transactions++;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			transactionText += "withdrawal of $" + amount + "\n";
		}
		transactions++;
	}

	public String toString() {
		return id;
	}


// YOUR CODE GOES HERE
	public void transfer(BankAccount acc, double money) {
		if (money <= 0 || balance < 5)
			return;
		balance -= 5;
		if (balance < money) {
			acc.deposit(balance);
			this.withdraw(balance);
		} else {
			acc.deposit(money);
			this.withdraw(money);
		}
	}
}

