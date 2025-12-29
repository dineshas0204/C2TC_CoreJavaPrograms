package prl.daysix1;

public class Wrapper_Class {

	public static void main(String[] args) {
		  // primitive into object --> autoboxing
        int x = 10;
        
        // Autoboxing: converting primitive int to Integer object
        Integer y = Integer.valueOf(x);
        
        System.out.println(y); // Output the Integer object
        
        // object into primitive --> unboxing
        // Unboxing: converting Integer object to primitive int
        int z = y;
        
        System.out.println(z); // Output the primitive int
	}

}
