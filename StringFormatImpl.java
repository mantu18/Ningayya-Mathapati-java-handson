package nin.com;

import java.util.Scanner;

public class StringFormatImpl implements StringFormatter{
	public static void main(String[] args) {
		StringFormatter formatter=s->{
			StringBuilder sb=new StringBuilder();
			for (int i=0;i<s.length();i++) {
				sb.append(s.charAt(i));
				 if (i != s.length() - 1) {
					 sb.append(" ");
	             }
			}
			return sb.toString();
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String input = sc.nextLine();
        String formatted = formatter.format(input);
        System.out.println("Formatted output: " + formatted);
        sc.close();
	}

	@Override
	public String format(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
