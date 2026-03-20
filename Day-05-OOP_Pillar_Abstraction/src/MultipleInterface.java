
// Remember — Java does not allow
// multiple inheritance with classes!
// But with interfaces it does! ✅
// Duck can both fly AND swim!
interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable, Swimmable{
    public void fly(){
        System.out.println("🦆 Duck flying!");
    }
    public void swim(){
        System.out.println("🦆 Duck swimming!");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();


    }
}
