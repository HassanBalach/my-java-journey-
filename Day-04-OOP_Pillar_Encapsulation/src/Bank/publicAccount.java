package Bank;

public class publicAccount {
    public  int accountNo;
}

class main{
    public static void main(String[] args) {
        publicAccount publicaccount = new publicAccount();
        publicaccount.accountNo = 9032;
        System.out.println("Account Number Detail: "+ publicaccount.accountNo);
    }
}