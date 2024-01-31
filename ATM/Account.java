package ATM;

/**
 *
 * @author huyduong
 */
public class Account {
    private String accountNumber;
    private String pinNumber;
    private double balance;
    
    public Account(String num, String pin, double bal) { 
        accountNumber = num;
        pinNumber = pin;
        balance = bal * 1.00;
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

    public String balToString() { 
        String s = "$" + getBalance();
        String spaces = "";
        for (int i = 0; i < 12 - (s.length() / 2); i++) { 
            spaces += " ";
        }
        return spaces + s;
    }

    public boolean withdraw(double withdrawAmount) { 
        if (balance >= withdrawAmount) { 
            balance -= withdrawAmount;
            return true;
        } else { 
            return false;
        }
    }

    public boolean deposit(double depositAmount) { 
        if (depositAmount > 0) { 
            balance += depositAmount;
            return true;
        } else { 
            return false;
        }
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return accountNumber;
    }

    
}