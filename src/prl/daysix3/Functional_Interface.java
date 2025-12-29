package prl.daysix3;

// Functional Interface for Greeting
@FunctionalInterface
public interface Functional_Interface {
    // Abstract method
    void greet();
}
 class GreetingDemo {

    public static void main(String[] args) {
        // Lambda expression implementing the greet() method
        Functional_Interface fi = () -> {
            System.out.println("Hi All! Welcome to the Java Session");
        };

        // Calling the greet() method
        fi.greet();
    }
}

