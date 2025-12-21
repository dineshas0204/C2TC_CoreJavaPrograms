package prl.dayfour2;

public class MethodOverlodingDemo { 
	int addition (int a,int b)
	{
		return a+b;
	}
	float addition (float a , float b)
	{
		return a+b;
	
	}

	public static void main(String[] args) {
		MethodOverlodingDemo mod = new MethodOverlodingDemo();
		System.out.println("Addition is:" +mod.addition(5, 15));
		System.out.println("Addition is:" +mod.addition(5.6f, 9.8f));
		
		

	}

}
