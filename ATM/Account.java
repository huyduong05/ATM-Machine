package ATM;
public class Account {
    private String accountNumber;
    private String pinNumber;
    private double balance;
    
    public Account(String num, String pin, double bal) { 
        accountNumber = num;
        pinNumber = pin;
        balance = bal;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
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
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return accountNumber;
    }

    
}