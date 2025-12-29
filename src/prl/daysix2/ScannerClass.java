package prl.daysix2;
import java.util.Scanner;


public class ScannerClass {

	public static void main(String[] args) {
		   
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        // Consume the leftover newline
        sc.nextLine();

        System.out.println("Enter your favorite programming language: ");
        String favLanguage = sc.nextLine();
        
        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Programming Language: " + favLanguage);
        
        sc.close();

	}

}
