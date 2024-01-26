package ATM;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ATM { 
    private HashMap<String, Account> accounts = new HashMap<String, Account>();

    public ATM() { 
        
        try {
            Scanner scan = new Scanner(new File("database.txt"));

            while(scan.hasNext()) { 
                String accountNum = scan.next();
                String pin = scan.next();
                double bal = scan.nextDouble();
                addAccount(accountNum, pin, bal);
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
    }

    public void addAccount(String accountNumber, String pinNumber, double balance) { 
        accounts.putIfAbsent(accountNumber, new Account(pinNumber, pinNumber, balance));
    }

    public void deleteAccount(String accountNumber) { 
        accounts.remove(accountNumber);
    }

    public boolean validAccount(String accountNumber,String pinNumber) { 
        if (accounts.containsKey(accountNumber)) { 
            Account a = accounts.get(accountNumber);
            if (a.getPinNumber() == pinNumber) { 
                return true;
            }
        }
        return false;
    }



}