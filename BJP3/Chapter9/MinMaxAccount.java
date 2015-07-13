/*



A company has written a large class BankingAccount with many methods including:
Method/Constructor 	Description
public BankingAccount(Startup s) 	constructs a BankingAccount object using information in the Startup object s
public void debit(Debit d) 	records the given debit
public void credit(Credit c) 	records the given credit
public int getBalance() 	returns current balance in pennies

Design a new class MinMaxAccount whose instances can be used in place of a BankingAccount object but include new behavior of remembering the minimum and maximum balances ever recorded for the account. You should provide the same methods as the superclass, as well as the following new behavior:
Method/Constructor 	Description
public MinMaxAccount(Startup s) 	constructs a MinMaxAccount object using information in the Startup object s
public int getMin() 	returns minimum balance in pennies
public int getMax() 	returns maximum balance in pennies

The account's constructor sets the initial balance based on the Startup information. Assume that only the debit and credit methods change an account's balance.
Related Files:

    BankingAccount.java


*/

public class MinMaxAccount extends BankingAccount{
    private int minimum;
    private int maximum;
    
    public MinMaxAccount(Startup s) {
	super(s);
	minimum = s.startup_getBalance();
	maximum = s.startup_getBalance();
    }

    private void set_min_max(int x) {
	if (x > maximum) {
	    maximum = x;
	}
	if (x < minimum) {
	    minimum = x;
	}
    }
    
    @Override
    public void debit(Debit d) {
	super.debit(d);
	set_min_max(super.getBalance());
    }

    @Override
    public void credit(Credit c) {
	super.credit(c);
	set_min_max(super.getBalance());
    }

    public int getMin() {
	return minimum;
    }

    public int getMax() {
	return maximum;
    }
}

