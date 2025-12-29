package prl.daysix3;

interface Fruits {
 void sweet();  // Declaration
 void sour();
}

public class InterfaceExample implements Fruits {


 public void sweet() {
     System.out.println("The fruits are sweet!!!");
 }

 public void sour() {
     System.out.println("The fruits are sour!!!");
 }

	public static void main(String[] args) {
		 InterfaceExample obj1 = new InterfaceExample();
	     
	     obj1.sweet();  
	     obj1.sour(); 

	}

}
