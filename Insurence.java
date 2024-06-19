package man.org;

import java.util.Scanner;

public class Insurence {
	public static void main(String[] args) {
		
		Insurence det=new Insurence();
		det.details();
		System.out.println("exit");	
	}
	public void details(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		System.out.println("enter a name");
		String name=sc.next();
		
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Gender (M/F):");
        	String gender = sc.next();
		
		
		System.out.println("salary");
		int salary=sc.nextInt();
		
		System.out.println("enter designation");
		String designation=sc.next();
		
		System.out.println("____________");
	        System.out.println("id: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Gender: " + gender);
	        System.out.println("Age: " + age);
	        System.out.println("salary: " + salary);
	        System.out.println("designation: " + designation);
        	if(salary>5000 && salary<20000) {
			System.out.println("insurence belongs to C scheme");
		}
		else if(salary>=20000 && salary<40000){
			System.out.println("insurence belongs to b scheme");
		}
		else if(salary>=40000) {
			System.out.println("insurence belongs to A scheme");
		}
		else {
			System.out.println("no scheme");
		}
		sc.close();
		
	}
	

