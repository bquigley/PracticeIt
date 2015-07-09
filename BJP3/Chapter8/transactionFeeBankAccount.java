/*


Suppose that you are provided with a pre-written class BankAccount as shown below. (The headings are shown, but not the method bodies, to save space.) Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.

Write an instance method named transactionFee that will be placed inside the BankAccount class to become a part of each BankAccount object's behavior. The transactionFee method accepts a fee amount (a real number) as a parameter, and applies that fee to the user's past transactions. The fee is applied once for the first transaction, twice for the second transaction, three times for the third, and so on. These fees are subtracted out from the user's overall balance. If the user's balance is large enough to afford all of the fees with greater than $0.00 remaining, the method returns true. If the balance cannot afford all of the fees or has no money left, the balance is left as 0.0 and the method returns false.

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

For example, given the following BankAccount object:

BankAccount savings = new BankAccount("Jimmy");
savings.deposit(10.00);
savings.deposit(50.00);
savings.deposit(10.00);
savings.deposit(70.00);

The account at that point has a balance of $140.00. If the following call were made:

savings.transactionFee(5.00);

Then the account would be deducted $5 + $10 + $15 + $20 for the four transactions, leaving a final balance of $90.00. The method would return true. If a second call were made,

savings.transactionFee(10.00);

Then the account would be deducted $10 + $20 + $30 + $40 for the four transactions, leaving a final balance of $0.00. The method would return false.
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
	public boolean transactionFee(double fee) {
		double total_fee = 0.0;
		for (int i=1; i<=transactions; i++) {
			total_fee += fee * i;
		}
		if (balance > total_fee) {
			balance -= total_fee;
			return true;
		} else {
			balance = 0;
			return false;
		}
	}
// MY CODE ENDS HERE
}
