package prl.dayfour2;
class AnimalClass{
	void sound() {
		System.out.println("Ainmals can make sound");
	}
}
class Lion extends AnimalClass {
	void sound() {
		System.out.println("Lion roars...");
	}
}

public class MethodOverriddingDemo {
	

	public static void main(String[] args) {
		AnimalClass a = new AnimalClass();
		a.sound();
		
		AnimalClass l = new Lion();
	    l.sound();

	}

}
