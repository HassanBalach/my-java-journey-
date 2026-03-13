// Compile-Time Polymorphism (Method Overloading) — same method name, different parameters, resolved at compile time.

// Expo center ticket booking service — demonstrates method overloading with 4 versions of bookTicket()
class ExpoCenterFunction {

    // Version 1: basic booking — only ticket count provided
    void bookTicket(int count) {
        System.out.println(count + " tickets are successfully booked for tomorrow.");
    }

    // Version 2: booking with seat type — compiler matches by (int, String)
    void bookTicket(int count, String seatType) {
        System.out.println(count + " " + seatType + " tickets are successfully booked for tomorrow.");
    }

    // Version 3: booking with seat type and discount — compiler matches by (int, String, int)
    void bookTicket(int count, String seatType, int discountCode) {
        System.out.println(count + " " + seatType + " tickets are successfully booked with the discount of " + discountCode);
    }

    // Version 4: booking with discount only — compiler distinguishes (int, int) from (int)
    void bookTicket(int count, int discountCode) {
        System.out.println(count + " tickets are successfully booked with discount code: " + discountCode);
    }
}

// Driver class — shows static dispatch, compiler picks the right version based on arguments
public class CompilarTypePolymorphismDemo {
    public static void main(String[] args) {

        // One object is enough to access all overloaded versions — no inheritance needed
        ExpoCenterFunction expo = new ExpoCenterFunction();

        expo.bookTicket(2);                      // → (int)              matches Version 1
        expo.bookTicket(5, "VIP");               // → (int, String)      matches Version 2
        expo.bookTicket(10, "Business", 1000);  // → (int, String, int) matches Version 3
        expo.bookTicket(3, 5000);                // → (int, int)         matches Version 4
    }
}