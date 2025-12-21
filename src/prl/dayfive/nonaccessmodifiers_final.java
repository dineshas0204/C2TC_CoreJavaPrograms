package prl.dayfive;

public class nonaccessmodifiers_final {
	final int x =100;
	void print() {
		System.out.println("print the value of x: "+x);
	}

	public static void main(String[] args) {
		
		nonaccessmodifiers_final fe =new nonaccessmodifiers_final();
		fe.print();
		
	}
}

