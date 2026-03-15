import Bank.ProtectedClassEx;

public class protectedDemo extends ProtectedClassEx {
    public static void main(String[] args) {
        protectedDemo protectedClassEx = new protectedDemo();
        protectedClassEx.bankName = "MEAZAN ISLAMIC BANK";
        System.out.println(protectedClassEx.bankName);

    }


}
