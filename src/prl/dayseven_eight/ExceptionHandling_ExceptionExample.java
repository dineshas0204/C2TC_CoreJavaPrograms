package prl.dayseven_eight;

public class ExceptionHandling_ExceptionExample {

	public static void main(String[] args) {
		try {
            // Code that might throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } 
		
		catch (ArithmeticException e) {
            // Code to handle the exception
            System.out.println("Error: Division by 0 is not possible.");
        } 
		
		finally {
            // Code that runs regardless of an exception
            System.out.println("This block always executes.");
        }
        
		System.out.println("Program continues after exception handling.");
    }

}
