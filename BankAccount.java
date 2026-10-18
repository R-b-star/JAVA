package deep;

public class BankAccount {

	    String owner;
	    int balance;

	    public BankAccount(String owner, int balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }

	    public void deposit(int amount) {
	        balance = balance + amount;
	    }

	    public void withdraw(int amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	        } else {
	            System.out.println("Not enough money!");
	        }
	    }

	    public void show() {
	        System.out.println(owner + ": " + balance);
	    }
	    
	    public boolean isRich() {
	        // true if balance > 1000, else false
	    	return balance > 1000;
	    }
	}

