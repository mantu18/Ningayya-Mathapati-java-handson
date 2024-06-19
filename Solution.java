package man.org;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Even ev=new Even();
		
		for(int i=1;i<=4;i++) {
			System.out.println("enter number");
			int n=sc.nextInt();
			ev.Odd(n);
			System.out.println("------------------");
			
		}
			
		

	}

}
