package Bank;

class defaultAccount{
    int balance;
}


public class Account {

    public static void main(String[] args){

        //NO ACCESS MODIFIER NO ACCESS OUT SIDE THE BANK PACKAGE : CHECK THE ERROR IN THE main outside the bank package:
        defaultAccount account = new defaultAccount();
        account.balance = 2000;
        System.out.println("Account Balance : "+account.balance);

        //THe difference between Public and Default is :
        // You can access the public class out side the Package mean all over the application ;


    }
}

// Example of public Modifier:
