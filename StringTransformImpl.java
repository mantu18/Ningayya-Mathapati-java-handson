package nin.com;

import java.util.Scanner;

public class StringTransformImpl implements StringTransform {
	

	public static void main(String[] args) {
		StringTransform strTransform=(str)->str.toUpperCase();
		StringTransform reverseString = s -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
		};
		
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String resultupper=strTransform.transform(str1);
		System.out.println("transformation is"+resultupper);
		String str2=sc.nextLine();
		String revResult=reverseString.transform(str2);
		System.out.println("reverse string is"+revResult);
		sc.close();
		}
		
		@Override
		public String transform(String s) {
			// TODO Auto-generated method stub
			return null;
		}
		
	
}
