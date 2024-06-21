package nin.com;

import java.util.Scanner;

public class AuthenticationImpl implements Authentication{
	
	public static void main(String[] args) {
		Authentication au=(username,password)->{
			String user="mantu";
			String pass="Mantu@2000";
			return username.equals(user) && password.equals(pass);
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user");
		String user=sc.nextLine();
		System.out.println("enter password");
		String password=sc.nextLine();
		System.out.println("user authentication "+  au.auth(user,password));
		
	
	}

	
}
