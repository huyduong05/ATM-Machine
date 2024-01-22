package ATM;
public class Account {
    private long accountNumber;
    private int pinNumber;
    private double balance;
    
    public Account(long num, int pin, double bal) { 
        accountNumber = num;
        pinNumber = pin;
        balance = bal;
    }
    
    public long getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdrawAmount) { 
        if (balance >= withdrawAmount) { 
            balance -= withdrawAmount;
        } else { 
            System.out.println("Insufficent Funds");
        }
    }

    public void deposit(double depositAmount) { 
        if (depositAmount > 0) { 
            balance += depositAmount;
        } else { 
            System.out.println("Invalid deposit amount");
        }
    }

    
}