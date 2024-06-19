package man.org;

import java.util.Scanner;

public class Insurence {
	private static final char[] id = null;
	private static final char[] name = null;



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter a name");
		String name=sc.next();
		
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Gender (M/F):");
        char gender = sc.next().charAt(0);
		
		
		System.out.println("salary");
		int salary=sc.nextInt();
		
		System.out.println("enter designation");
		String designation=sc.next();
		
		
	}

	
	
	public void details(){
		Insurence det=new Insurence();
		System.out.println(det.id);
		System.out.println(det.name);
		det.details();
	}
	
}
