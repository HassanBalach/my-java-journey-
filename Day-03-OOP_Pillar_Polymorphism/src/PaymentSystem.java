/*
Imagine you are on Daraz checkout page:
Select Payment Method:
  🔵 Credit Card
  🟢 JazzCash
  🟠 EasyPaisa

Enter Amount: 5000
Discount Code: EID20

[ Confirm Payment ]
*/
import java.util.Scanner;

class PaymentProcess{

    void processPayment(int amount){
            System.out.println("Processing payment...");
        }
    void processPayment(int amount, int discountCode){
        System.out.println("Processing payment...");
    }

    void discountFn(int amount ,  String paymentMethod){
        double discount = amount * 10.0/100;
        double finalAmount = amount - discount;
        System.out.println("Original Amount: Rs: " + amount);
        System.out.println("✅ Rs:"+ finalAmount + " paid via "+ paymentMethod + ". Along with the special Discount off 10%:");
    }

}

class CreditCard extends PaymentProcess{
    @Override
    void processPayment(int amount){
        System.out.println("Customer selects Credit Card...");
        System.out.println("✅ Rs:"+ amount + " paid via Credit Card.");
    }

    @Override
    void processPayment(int amount , int discountCode){
        System.out.println("Customer selects Credit Card...");
        discountFn(amount , "Credit Card");
    }
}

class JazzCash extends PaymentProcess{
    @Override
    void processPayment(int amount){
        System.out.println("Customer selects JazzCash...");
        System.out.println("✅ Rs:"+ amount + " paid via JazzCash wallet.");
    }

    @Override
    void processPayment(int amount , int discountCode){
        System.out.println("Customer selects JazzCash...");
        discountFn(amount , "JazzCash");
        }
}

class EasyPaisa extends PaymentProcess{
    @Override
    void processPayment(int amount){
        System.out.println("Customer selects EasyPaisa...");
        System.out.println("✅ Rs:"+ amount + " paid via EasyPaisa wallet.");
    }

    @Override
    void processPayment(int amount , int discountCode){
        System.out.println("Customer selects EasyPaisa...");
        discountFn(amount , "EasyPaisa");
        }
}

public class PaymentSystem {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("Press 1️⃣ for : Credit Card");
        System.out.println("Press 2️⃣ for : JazzCash");
        System.out.println("Press 3️⃣ for : EasyPaisa");
        int paymentGateway = input.nextInt();

        System.out.println("Enter the amount:");
        int paymentAmount = input.nextInt();
        input.nextLine();

        boolean hasDiscount = false;
        System.out.println("Do you have Discount Code? Write 'Y' for yes 'N' for not:");
        String discountCode = input.nextLine();

        char discountedCodeValue;
        int discountedCodeInputValue = 0;

        if(discountCode.isEmpty()){
            System.out.println("NO Input Entered");
        }else {
             discountedCodeValue = discountCode.charAt(0);
            if(discountedCodeValue == 'Y' || discountedCodeValue == 'y'){
                System.out.println("Enter discount code?");
                int testingCode;
                testingCode = input.nextInt();
                if(testingCode == 1234){
                    System.out.println("🎉 Discount Code Accepted!");
                    discountedCodeInputValue = testingCode;
                }else{
                    System.out.println("Sorry Your Code is wrong;");
                    return;

                }
                hasDiscount = true;
            }
        }


        PaymentProcess creditCard = new CreditCard();
        PaymentProcess jazzcash = new JazzCash();
        PaymentProcess easypaisa = new EasyPaisa();

        switch (paymentGateway){
            case 1:
                if(!hasDiscount) creditCard.processPayment(paymentAmount);
                else creditCard.processPayment(paymentAmount , discountedCodeInputValue);
                return;

            case 2:
                if (!hasDiscount) jazzcash.processPayment(paymentAmount);
                else jazzcash.processPayment(paymentAmount , discountedCodeInputValue);
                return;

            case 3:
                if (!hasDiscount) easypaisa.processPayment(paymentAmount);
                else easypaisa.processPayment(paymentAmount , discountedCodeInputValue);
                return;

            default:
                System.out.println("No such Transition Method Exist yet:");
        }

        input.close();
    }
}
