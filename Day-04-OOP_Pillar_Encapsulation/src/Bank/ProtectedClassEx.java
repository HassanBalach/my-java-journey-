package Bank;

class ProtectedClass{
    protected int bankBalance;

}

public class ProtectedClassEx {
            protected  String bankName;
        public static void main(String[] args) {
            ProtectedClass protectedclass = new ProtectedClass();
            protectedclass.bankBalance = 20000;

            ProtectedClassEx protectedClassEx = new ProtectedClassEx();
            protectedClassEx.bankName = "Al-Habib Bank Limited";
            System.out.println(protectedclass.bankBalance);
            System.out.println(protectedClassEx.bankName);
        }

}
