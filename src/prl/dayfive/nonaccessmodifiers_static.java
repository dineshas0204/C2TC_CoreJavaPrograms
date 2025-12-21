package prl.dayfive;

public class nonaccessmodifiers_static {
	  // Static variable
    static int count;

    // Instance variable
    int variable;

    // Static block (executes once when class is loaded)
    static {
        count = 15;

        // Cannot access instance variable in static block
        // variable = 20;

        System.out.println("Static block executed. Static variable count: " + count);
    }

    // Static method
    static void display() {
        System.out.println("Static method called. Static variable count: " + count);
    }

    // Instance method
    void showInstanceVariable() {
        variable = 50;
        System.out.println("Instance method called. Instance variable: " + variable);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Calling static method
        display();

        // Creating objects to demonstrate instance variable
        nonaccessmodifiers_static obj1 = new nonaccessmodifiers_static();
        nonaccessmodifiers_static obj2 = new nonaccessmodifiers_static();

        obj1.showInstanceVariable();
        obj2.showInstanceVariable();

        System.out.println("Accessing static variable through class name: " + nonaccessmodifiers_static.count);
    }
}
