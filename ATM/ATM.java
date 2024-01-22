package ATM;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ATM { 
    private HashMap<Long, Account> accounts = new HashMap<Long, Account>();

    public ATM() { 
        
        try {
            Scanner scan = new Scanner(new File("database.txt"));

            while(scan.hasNext()) { 
                Long accountNum = scan.nextLong();
                int pin = scan.nextInt();
                double bal = scan.nextDouble();
                addAccount(accountNum, pin, bal);
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
    }

    public void addAccount(Long accountNumber, int pinNumber, double balance) { 
        accounts.putIfAbsent(accountNumber, new Account(pinNumber, pinNumber, balance));
    }

    public void deleteAccount(Long accountNumber) { 
        accounts.remove(accountNumber);
    }



}