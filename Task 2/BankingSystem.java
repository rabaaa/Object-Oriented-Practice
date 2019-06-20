import java.util.Scanner;
import java.util.List;
import java.util.ArrayList; 
/**
 * Class BankingSystem.
 * This class work as main menu for banking system and used for account 
 * creation & updation.
 * 
 * @author Rabia Nazir
 * 
 * @version 1.0
 * 
 * 23 December 2018
 */



public class BankingSystem
{
    Scanner input;
    List<SavingAccount> savingAccounts;
    List<CheckingAccount> checkingAccounts;
    public BankingSystem(){
       input = new Scanner(System.in);
       savingAccounts = new ArrayList<>();
       checkingAccounts = new ArrayList<>();
    }
    //Method to show a menu for ABC bank
    public void mainMenu(){
       System.out.println("********************************");
       System.out.println("Welcome to ABC Bank");
       System.out.println();
       System.out.println("1. Create new Account");
       System.out.println("2. Get Account Details");
       System.out.println("********************************");
       System.out.println("Enter your option");
       int option = input.nextInt();
       selectingMenu(option);
       
    }
    // call the function according to user selection
    private void selectingMenu(int option){
        switch(option){
           case 1:
                newAccount();
                break;
           case 2:
                getAccountDetails();
                break;
           default:
                System.out.println("Inavlid input, Try Again with valid option : ");
                selectingMenu(input.nextInt());
        }
    }
    //Method to show a menu for new bank account opening
    private void newAccount(){
        
       System.out.println("********************************");
       System.out.println("New Account Opening");
       System.out.println("Please Select Account Type");
       System.out.println();
       System.out.println("1. Saving Account");
       System.out.println("2. Checking Account");
       System.out.println("0. Main Menu");
       System.out.println("********************************");
       System.out.println("Enter your option");
       selectingAccountType(input.nextInt(), true);
    }
    
    // call the function according to user selection
    private void selectingAccountType(int option, boolean isNewAccount){
        switch(option){
           case 0:
                mainMenu();
                break;
           case 1:
                if(isNewAccount){
                    openSavingAccount();
                }else{
                    getSavingAccountDetails();
                }
                break;
           case 2:
                if(isNewAccount){
                    openCheckingAccount();
                }else{
                
                }
                break;
           default:
                System.out.println("Inavlid input, Try Again with valid option : ");
                selectingAccountType(input.nextInt(), isNewAccount);
        }
    }
    //Method to show a menu for saving account opening
    private void openSavingAccount(){
        System.out.println("********************************");
        System.out.println("Please Enter Saving Account Details");
        System.out.println("Enter Customer Name : ");
         input.nextLine(); //Use this line to skip \n from input
        String name = input.nextLine();
        System.out.println("Enter Account Number : ");
        String accountNumber = input.nextLine();
        System.out.println("Enter First Deposit Amount : ");
        double amount = input.nextDouble();
        
        savingAccounts.add(new SavingAccount(name, accountNumber, amount));
        System.out.println();
        System.out.println("Account Created Successfully!");
        System.out.println("Here are account Details.");
        savingAccounts.get(savingAccounts.size()-1).getAccountDetails();
        mainMenu();
    }
    //Method to show a menu for checking account opening
    private void openCheckingAccount(){
        System.out.println("********************************");
        System.out.println("Please Enter Checking Account Details");
        System.out.println("Enter Customer Name : ");
        input.nextLine(); //Use this line to skip \n from input
        String name = input.nextLine();
        System.out.println("Enter Account Number : ");
        String accountNumber = input.nextLine();
        System.out.println("Enter First Deposit Amount : ");
        double amount = input.nextDouble();
        
        checkingAccounts.add(new CheckingAccount(name, accountNumber, amount));
        System.out.println();
        System.out.println("Account Created Successfully!");
        System.out.println("Here are account Details.");
        checkingAccounts.get(checkingAccounts.size()-1).getAccountDetails();
        mainMenu();
    }
    //Method to show a menu to see account details
    private void getAccountDetails(){
       System.out.println("********************************");
       System.out.println("Account Details:-");
       System.out.println("Please Select Account Type");
       System.out.println();
       System.out.println("1. Saving Account");
       System.out.println("2. Checking Account");
       System.out.println("0. Main Menu");
       System.out.println();
       System.out.println("Enter your option");
       selectingAccountType(input.nextInt(), false);
    }
    //Method to show a menu to get saving account details
    private void getSavingAccountDetails(){
        System.out.println("********************************");
        System.out.println("Please Enter your Account No.");
        input.nextLine();
        String accountNumber = input.nextLine();
        SavingAccount account= getSavingAccountById(accountNumber);
        while(account == null){
            System.out.println("Invalid Account Number! Please Enter Again or exit to go back to main menu");
            accountNumber = input.nextLine();
            if(accountNumber.equals("exit")){
                mainMenu();
                break;
            }
            account= getSavingAccountById(accountNumber);
        }
        if(account!=null){
            callSavingAccountMethods(account);
        }
        
    }
    //Method to get saving account by Id
    private SavingAccount getSavingAccountById(String accountNumber){
        SavingAccount savingAccount = null;
        for(SavingAccount account : savingAccounts){
            if(account.getAccountNumber().equals(accountNumber))
                savingAccount = account;
        }
        return savingAccount;
    }
    // calling saving account methods
    private void callSavingAccountMethods(SavingAccount account){
        System.out.println("********************************");
        System.out.println("Here is your Account Details:");
        account.getAccountDetails();
        System.out.println();
        System.out.println("Please select your option");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Add Interest");
        System.out.println("4. Previous Menu");
        System.out.println("0. Main Menu");
        int choice = input.nextInt();
        savingAccMethods(choice, account);
    }
    
    // call the function according to user selection such as deposit or withdraw money   
    private void savingAccMethods(int choice, SavingAccount account){
        switch(choice){
            case 0:
                mainMenu();
                break;
            case 1:
                System.out.println("Please Enter Deposit Amount : ");
                account.depositMoney(input.nextDouble());
                System.out.println("Amount Deposit Successfully!");
                callSavingAccountMethods(account);
                break;
            case 2:
                System.out.println("Please Enter Withdraw Amount : ");
                if(account.withdrawMoney(input.nextDouble())){
                    System.out.println("Amount Withdraw Successfully!");
                }else{
                    System.out.println("Operation Failed! Please Try Again");
                }
                callSavingAccountMethods(account);
                break;
            case 3:
                account.addInterest(5); 
                callSavingAccountMethods(account);
                break;
            case 4:
                getAccountDetails();
                break;
            default:
                System.out.println("Inavlid input, Try Again with valid option : ");
                savingAccMethods(input.nextInt(), account);
        }
    }
    //Method to show a menu to get checking account details
    private void getCheckingAccountDetails(){
        System.out.println("********************************");
        System.out.println("Please Enter your Account No.");
        input.nextLine();
        String accountNumber = input.nextLine();
        CheckingAccount account= getCheckingAccountById(accountNumber);
        while(account == null){
            System.out.println("Invalid Account Number! Please Enter Again or exit to go back to main menu");
            accountNumber = input.nextLine();
            if(accountNumber.equals("exit")){
                mainMenu();
                break;
            }
            account= getCheckingAccountById(accountNumber);
        }
        if(account!=null){
            callCheckingAccountMethods(account);
        }
        
    }
    // Method to get checking account by Id
    private CheckingAccount getCheckingAccountById(String accountNumber){
        CheckingAccount checkingAccount = null;
        for(CheckingAccount account : checkingAccounts){
            if(account.getAccountNumber().equals(accountNumber))
                checkingAccount = account;
        }
        return checkingAccount;
    }
    // calling checking account methods
    private void callCheckingAccountMethods(CheckingAccount account){
        System.out.println("********************************");
        System.out.println("Here is your Account Details:");
        account.getAccountDetails();
        System.out.println();
        System.out.println("Please select your option");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Previous Menu");
        System.out.println("0. Main Menu");
        int choice = input.nextInt();
        checkingAccMethods(choice, account);
    }
    // call the function according to user selection such as deposit or withdraw money 
    private void checkingAccMethods(int choice, CheckingAccount account){
        switch(choice){
            case 0:
                mainMenu();
                break;
            case 1:
                System.out.println("Please Enter Deposit Amount : ");
                account.depositMoney(input.nextDouble());
                System.out.println("Amount Deposit Successfully!");
                callCheckingAccountMethods(account);
                break;
            case 2:
                System.out.println("Please Enter Withdraw Amount : ");
                if(account.withdrawMoney(input.nextDouble())){
                    System.out.println("Amount Withdraw Successfully!");
                }else{
                    System.out.println("Operation Failed! Please Try Again");
                }
                callCheckingAccountMethods(account);
                break;
            case 3:
                getAccountDetails();
                break;
            default:
                System.out.println("Inavlid input, Try Again with valid option : ");
                checkingAccMethods(input.nextInt(), account);
        }
    }
    
}
