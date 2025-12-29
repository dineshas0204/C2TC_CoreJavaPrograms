package prl.dayseven_eight;
//Custom Exception Class
class InvalidBalanceException extends Exception {
// Constructor to pass the error message to the parent Exception class
InvalidBalanceException(String message) {
   super(message);
}
}


public class ExceptionHandling_CustomExceptionExample {
static void withdraw(int balance) throws InvalidBalanceException {
    if (balance < 1000) {
        throw new InvalidBalanceException("Insufficient balance");
    }
    System.out.println("Withdrawal successful");
}


	public static void main(String[] args) {
		 try {
	         withdraw(500);
	     } 
	     catch (InvalidBalanceException e) {
	         System.out.println(e.getMessage());  // Output: Insufficient balance
	     }
		

	}

}
