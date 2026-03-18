import java.util.ArrayList;
import java.util.Scanner;

class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private  double balance;

   public BankAccount(String accountHolder , String accountNumber , double balance){
       setAccountCreation(accountHolder , accountNumber , balance);

   }

   public void setAccountCreation(String accountHolder , String accountNumber , double balance){

       if(accountHolder == null || accountHolder.isEmpty()){
           throw  new IllegalArgumentException("Account should have a proper name....");

       }

       if(accountNumber == null || accountNumber.isEmpty()){
           throw  new IllegalArgumentException("There is something wrong with Account number");

       }

       if(balance < 0 ){
           throw  new IllegalArgumentException("Opening balance cannot be negative!");


       }
       this.accountHolder = accountHolder;
       this.accountNumber = accountNumber;
       this.balance = balance;

   }

    //Getter

    public String getAccountHolder(){return accountHolder;}
    public String getAccountNumber(){return accountNumber;}
    public double getBalance(){return balance;}


    public void deposit(double bankBalance){
        if(bankBalance <= 0){
            System.out.println("❌ Invalid deposit amount!");

        }else {
            balance += bankBalance;
            System.out.println("✅ Deposited Rs." + bankBalance);
            System.out.println("New Balance: Rs." + balance);
        }
    }


    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= 0){
            System.out.println("❌ Amount must be great than 0");

        } else if (balance < withdrawAmount) {
            System.out.println("❌ Insufficient Balance");
        } else {
            balance -= withdrawAmount;
            System.out.println("✅ Withdraw Rs." + withdrawAmount);
            System.out.println("New Balance: Rs." + balance);
        }
    }


    public void displayInfo() {
        System.out.println("===== Account Info =====");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }


}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountHolder , String accountNumber , double balance , double interestRate){
        super(accountHolder , accountNumber , balance);
        setInterestRate(interestRate);

    }

    public void setInterestRate(double interestRate){
        if(interestRate < 0 || interestRate > 100){
            throw new IllegalArgumentException("Interest rate must be between 0 and 100!");
        }
        this.interestRate = interestRate;

    }

    public void addInterest(){
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("🎉 Interest Added: Rs." + interest);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();   // prints name, number, balance
        System.out.println("Interest Rate: " + interestRate + "%");  // extra info!
    }

}

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList <BankAccount> accounts = new ArrayList<>();


        //After creation of the account he/she is able
        // to send money ;
        // withdraw money:
        //Condition:
        // User should have the pin code to access his / her account to perform operation.
        System.out.println("Welcome to SGF Bank");

        while (true) {

            System.out.println("Press");
            System.out.println("1️⃣ For Account creation: ");
            System.out.println("2️⃣ For Sending Money to Account: ");
            System.out.println("3️⃣ For withdrawing Money from Account: ");
            System.out.println("4️⃣ Add Interest to Savings Account");


            int accountPress = input.nextInt();
            input.nextLine();

            switch (accountPress) {
                case 1:

                    System.out.println("========== Create Your First Account ============");

                    System.out.println("Select Account Type:");
                    System.out.println("1️⃣ Regular Account");
                    System.out.println("2️⃣ Savings Account");
                    int accountType = input.nextInt();
                    input.nextLine();


                    System.out.println("Enter your Name? ");
                    String accountName = input.nextLine();

                    System.out.println("Enter your Account Number");
                    String accountNumber = input.nextLine();

                    boolean exists = false;
                    for (BankAccount acc : accounts) {
                        if (acc.getAccountNumber().equals(accountNumber)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("Account Already Exist:");
                        System.out.println(" ");
                    } else {
                        System.out.println("Enter Opening Balance");
                        double balance = input.nextDouble();
                        if(accountType == 1){
                            accounts.add(new BankAccount(accountName, accountNumber, balance));
                        }else if(accountType == 2){
                            System.out.println("Enter Interest Rate %:");
                            double interestRate = input.nextDouble();
                            accounts.add(new SavingAccount(accountName, accountNumber, balance , interestRate));
                        }
                        System.out.println("🎉 Account created successfully!");
                        System.out.println(" ");

                    }
                    break;


                case 2:
                    System.out.println("Enter Your Pin Code");
                    String pinCode =  input.nextLine();
                    BankAccount foundAccount = null;
                    for(BankAccount acc : accounts){
                        if(acc.getAccountNumber().equals(pinCode)){
                            foundAccount = acc;
                            break;
                        }
                    }

                    if(foundAccount == null){
                        System.out.println("❌ Account not found!");

                    }else{
                        System.out.println("Enter the amount you want to send:");
                        double amount = input.nextDouble();
                        input.nextLine();
                        foundAccount.deposit(amount);


                    }

                    break;

                case 3:
                    System.out.println("Enter Your Pin Code");
                    String pin = input.nextLine();
                    BankAccount accountExists = null;
                    for(BankAccount acc: accounts){
                        if(acc.getAccountNumber().equals(pin)){
                            accountExists = acc;
                            break;
                        }
                    }
                    if(accountExists == null){
                        System.out.println("No such Account Exist");
                    }else{
                        System.out.println("Enter Amount You want to withdraw...");
                        double withdrawAmount = input.nextDouble();
                        accountExists.withdraw(withdrawAmount);

                    }
                    break;

                case 4:

                    System.out.println("Enter Your Account Number:");
                    String intNumber = input.nextLine();

                    // Find the account
                    BankAccount foundAcc = null;
                    for(BankAccount acc : accounts) {
                        if(acc.getAccountNumber().equals(intNumber)) {
                            foundAcc = acc;
                            break;
                        }
                    }

                    if(foundAcc == null) {
                        System.out.println("❌ Account not found!");
                    } else if(foundAcc instanceof SavingAccount) {
                        ((SavingAccount) foundAcc).addInterest();  // ✅ call addInterest!
                    } else {
                        System.out.println("❌ This is not a Savings Account!");
                    }
                    break;

                default:
                    System.out.println("Sorry There Are Some Technical Issues:");
                    break;
            }

        }
    }


}






