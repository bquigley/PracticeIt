public class BankingAccount {
    private int balance;
    
    private List<String> historyTransaction;
    private List<String> historyBalance;
    
    public BankingAccount() {
        historyTransaction = new LinkedList<String>();
        historyBalance = new LinkedList<String>();
    }
    
    public BankingAccount(Startup s) {
        this.balance = s.startup_getBalance();
        historyTransaction = new LinkedList<String>();
        historyBalance = new LinkedList<String>();
        
        historyTransaction.add(valueToHistory(s.startup_getBalance()));
        historyBalance.add(toString());
    }
    
    public void debit(Debit d) {
        balance += d.debit_getBalance();
        
        historyTransaction.add(valueToHistory(d.debit_getBalance()));
        historyBalance.add(toString());
    }
    
    public void credit(Credit c) {
        balance += c.credit_getBalance();
        
        historyTransaction.add(valueToHistory(c.credit_getBalance()));
        historyBalance.add(toString());
    }
    
    public int getBalance() {
        return balance;
    }
    
    public boolean equals(Object o) {
        if(o instanceof BankingAccount) {
            return (this.getBalance() == ((BankingAccount) o).getBalance());
        }
        return false;
    }
    
    private String valueToHistory(int value) {
        int absValue = Math.abs(value);
        return (value < 0 ? "(-" : "") + (absValue / 100) + "." + (absValue % 100 / 10) + (absValue % 100 % 10) + (value < 0 ? ")" : " ");
    }
    
    public String toString() {
        int absBalance = Math.abs(balance);
        return (balance < 0 ? "-" : "") + "$" + (absBalance / 100) + "." + (absBalance % 100 / 10) + (absBalance % 100 % 10);
    }
    
    public String historyBalanceToString() {
        /*int maxLength = 0;
        for(String piece : historyBalance) {
            maxLength = Math.max(maxLength, piece.length());
        }*/
        int maxLength = 8;
        
        String build = "";
        for(int i = 0; i < historyBalance.size(); i++) {
            for(int j = 0; j < maxLength - historyBalance.get(i).length(); j++) {
                build += " ";
            }
            build += historyBalance.get(i);
            if(i != historyBalance.size() - 1) {
                build += "\n";
            }
        }
        
        return build;
    }
    
    public String historyTransactionToString() {
        String total = toString() + " ";
        
        int maxLength = 0;
        for(String piece : historyTransaction) {
            maxLength = Math.max(maxLength, piece.length() + 2);
        }
        maxLength = Math.max(maxLength, total.length() + 2);
        
        String build = "";
        for(int i = 0; i < historyTransaction.size() - 1; i++) {
            for(int j = 0; j < maxLength - historyTransaction.get(i).length(); j++) {
                build += " ";
            }
            build += historyTransaction.get(i);
            build += "\n";
        }
        
        build += "+";
        for(int i = 0; i < maxLength - (historyTransaction.get(historyTransaction.size() - 1).length() + 1); i++) {
            build += " ";
        }
        build += historyTransaction.get(historyTransaction.size() - 1);
        build += "\n";
        
        for(int i = 0; i < maxLength; i++) {
            build += "-";
        }
        build += "\n";
        
        for(int i = 0; i < maxLength - total.length(); i++) {
            build += " ";
        }
        build += total;
        
        return build;
    }
    
    public static class Startup {
        private int balance;
        
        public Startup(int balance) {
            this.balance = balance;
        }
        
        public int startup_getBalance() {
            return balance;
        }
    }
    
    public static class Debit {
        private int balance;
        
        public Debit(int balance) {
            this.balance = balance;
        }
        
        public int debit_getBalance() {
            return balance;
        }
    }
    
    public static class Credit {
        private int balance;
        
        public Credit(int balance) {
            this.balance = balance;
        }
        
        public int credit_getBalance() {
            return balance;
        }
    }
    
//  REPLACEME

}
