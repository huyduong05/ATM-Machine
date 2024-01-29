package ATM;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author huyduong
 */
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
            scan.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

    public void addAccount(String accountNumber, String pinNumber, double balance) { 
        accounts.putIfAbsent(accountNumber, new Account(pinNumber, pinNumber, balance));
        // System.out.println(accounts.size());
    }

    public void deleteAccount(String accountNumber) { 
        accounts.remove(accountNumber);
    }

    public boolean validAccount(String accountNumber,String pinNumber) { 
        if (accounts.containsKey(accountNumber)) { 
            Account a = accounts.get(accountNumber);
            if (a.getPinNumber().equals(pinNumber)) { 
                return true;
            }
        }
        return false;
    }

    public Account getAccount(String s) { 
        return accounts.get(s);
    }



}