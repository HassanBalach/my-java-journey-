/**
 * Runtime Polymorphism Demo
 *
 * CONCEPT: Runtime Polymorphism (also called Dynamic Method Dispatch) occurs when
 * an overridden method is resolved at runtime rather than compile-time.
 * The JVM decides WHICH version of the method to call based on the actual
 * object type, not the reference type.
 *
 * KEY INGREDIENTS:
 *  1. Inheritance      → subclass extends superclass
 *  2. Method Overriding → subclass redefines a superclass method
 *  3. Upcasting        → superclass reference holds a subclass object
 */


/**
 * Base class (Superclass / Parent class)
 * Defines a general behavior 'sound()' that every Animal has.
 * This acts as the CONTRACT that all subclasses must honor.
 */
class Animal {
    /**
     * This method will be OVERRIDDEN by each subclass.
     * At runtime, JVM will NOT call this version if a subclass has overridden it.
     */
    void sound() {
        System.out.println("Every animal has its own special god gifted sound.");
    }
}


/**
 * Subclass 1: Dog
 * Inherits from Animal and provides its OWN implementation of sound().
 */
class Dog extends Animal {

    /**
     * @Override tells the compiler: "I am intentionally overriding the
     * parent class method." If the method signature doesn't match, compiler
     * will throw an error — preventing silent bugs.
     */
    @Override
    void sound() {
        System.out.println("Barking ....");
    }
}


/**
 * Subclass 2: Cat
 * Inherits from Animal and provides its OWN implementation of sound().
 */
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Mewo .....");
    }
}


/**
 * Subclass 3: JavaBird
 * Inherits from Animal and provides its OWN implementation of sound().
 */
class JavaBird extends Animal {

    @Override
    void sound() {
        System.out.println("cho cho");
    }
}


/**
 * Driver class — Entry point of the program.
 * Demonstrates Runtime Polymorphism in action.
 */
public class polyMorphismDemo {

    public static void main(String[] args) {



        Animal dog = new Dog();
        dog.sound(); // → Calls Dog's sound() at runtime  →  "Barking ...."

        Animal cat = new Cat();
        cat.sound(); // → Calls Cat's sound() at runtime  →  "Mewo ....."

        Animal javaBird = new JavaBird();
        javaBird.sound(); // → Calls JavaBird's sound() at runtime  →  "cho cho"

        /**
         * NOTICE: All three variables are of type 'Animal' (same reference type),
         * yet each calls a DIFFERENT version of sound().
         * That's the power of Runtime Polymorphism — one interface, many behaviors.
         */
    }
}