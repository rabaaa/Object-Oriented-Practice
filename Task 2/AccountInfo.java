/**
 * AccountInfo abstract Class.
 * This class defines some basic methods of banking
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 21 December 2018
 */ 
abstract public class AccountInfo
{   
    //Attributes
    //Protected attributes. Only sub-classes of AccountInfo
    //can see these attributes
    protected String customerName;
    protected String accountNumber;
    protected double accountBalance;
    
    /** 
     * Constructor method to set customer name, account number 
     * and account balance
     */
    public AccountInfo(String customerName, String accountNumber, double accountBalance) 
    {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    
    /**
     * Set the name of the customer
     * 
     * @param customerName the name of customer (as String)  
     * 
    */
    //Method to set the name of customer
    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }
    
    /**
     * Get the name of the customer 
     * 
     * @return the name of the customer (as String)
    */
    //Method to return the customer name
    public String getCustomerName() 
    {
        return customerName;
    }
    
    /**
     * Set the account number
     * 
     * @param accountNumber the account number  (as String)  
     * 
    */
    //Method to set the account number
    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }
    
    /**
     * Get the account number 
     * 
     * @return the account number (as String)
    */
    //Method to return the account number
    public String getAccountNumber() 
    {
        return accountNumber;
    }
    
    /**
     * Set the account balance 
     * 
     * @param accountBalance the balance in the account (as double)  
     * 
    */
    //Method to set the account balance
    public void setAccountBalance(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }
    //method to get the account details 
    public void getAccountDetails(){
        System.out.println("Name      : "+customerName);
        System.out.println("Account # : "+accountNumber);
        System.out.println("Balance   : "+accountBalance);
    }
    
    //abstract methods which must be implemented by
    // all subclasses of AccountInfo
    abstract public void depositMoney(double amount);
    abstract public boolean withdrawMoney(double amount);
    abstract public double getAccountBalance();
}
