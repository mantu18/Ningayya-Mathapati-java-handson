package man.org;
import java.util.Scanner;

public class PersonDetails {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter First Name:");
	        String firstName = scanner.nextLine();
	        
	        System.out.println("Enter Last Name:");
	        String lastName = scanner.nextLine();
	        
	        System.out.println("Enter Gender (M/F):");
	        char gender = scanner.next().charAt(0);
	        
	        System.out.println("Enter Age:");
	        int age = scanner.nextInt();
	        
	        System.out.println("Enter Weight:");
	        double weight = scanner.nextDouble();
	        
	        
	        System.out.println("\nPerson Details:");
	        System.out.println("____________");
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("Weight: " + weight);
	        
	        scanner.close();
	}
}
