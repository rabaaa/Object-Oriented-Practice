/**
 * Class SavingAccount.
 * This class inherit methods from Account info and work according to SavingAccount description.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 23 December 2018
 */ 
public class SavingAccount extends AccountInfo
{   
    // Constructor Method
    /** 
     * Constructor method to set customer name, account number 
     * and account balance
    */
    public SavingAccount(String customerName, String accountNumber, double accountBalance) 
    
    {
        //call the AccountInfo constructor 
        super(customerName, accountNumber, accountBalance);
    }
    
    /** 
     * Method to deposit money
    */
    public void depositMoney(double amount) {
        accountBalance += amount;
    }
    
    /** 
     * Method to withdraw money
    */
    public boolean withdrawMoney(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }
    
    /** 
     * Method to Check User current account balance
    */
    public double getAccountBalance() {
        return accountBalance;
    }
    
    /**
     *Method to calculate the interest on a saving account.
    */
    public void addInterest(double interestRate) {
        //interestRate calculated on annual basis then divide it into per month
        accountBalance += (((accountBalance / 100) * interestRate) / 12);
        System.out.println("Interest Added Successfully! Your new Account Balance is "+accountBalance);
    }
    
    
}
