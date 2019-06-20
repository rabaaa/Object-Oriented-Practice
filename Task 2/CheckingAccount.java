/**
 * Class CheckingAccount.
 * This class inherit methods from Account info and work according to checkingAccount description.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 23 December 2018
 */ 
public class CheckingAccount extends AccountInfo
{   
    // Constructor Method
    /** 
     * Constructor method to set customer name, account number 
     * and account balance
    */
    public CheckingAccount(String customerName, String accountNumber, double accountBalance) 
    {   
        //call the AccountInfo constructor 
        super(customerName, accountNumber, accountBalance);
    }
    
    /** 
     * Method to deposit money
    */
    public void depositMoney(double amount) 
    {
        accountBalance += amount;
    }
    
    /** 
     * Method to withdraw money
    */ 
    public boolean withdrawMoney(double amount) 
    {
        accountBalance -= amount;
        return true;
    }
    
    /** 
     * Method to Check User current account balance
    */
    public double getAccountBalance() {
        return accountBalance;
    }
}
