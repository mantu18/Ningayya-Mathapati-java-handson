package man.org;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int num;
		do {
			System.out.println("enter a string:");
			str=sc.nextLine();
			System.out.println("choose an number");
			System.out.println("1.add the string");
			System.out.println("2.replace the odd position with  #");
			System.out.println("3.Remove duplicate characters in the String ");
			System.out.println("4.Change odd characters to upper case ");
			System.out.println("5.exit");
			num =sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1:
				System.out.println(addStringToItself(str));
				break;
			case 2:
				System.out.println(replacewith(str));
				break;
			case 3:
				System.out.println(removeDuplicates(str));
				break;
			case 4:
				System.out.println(changeOddToUpperCase(str));
				break;
			default:
				System.out.println("exit the condition");
			}
			
			
		}while(num!=5);
		sc.close();
		

	}
	public static String addStringToItself(String str) {
        return str + str;
    }
	public static String replacewith(String str) {
		String rep="";
		for(int i=0; i<=str.length()-1;i++) {
			if(i%2==0) {
				 rep=rep+str.charAt(i);
			}
			else {
				rep=rep+'#';
			}
		
		}
		return rep;
		
		
	}
	   public static String removeDuplicates(String str) {
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < str.length(); i++) {
	            char currentChar = str.charAt(i);
	            if (result.indexOf(String.valueOf(currentChar)) == -1) {
	                result.append(currentChar);
	            }
	        }
	        return result.toString();
	    }
    public static String changeOddToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(currentChar));
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
	
			
			
		



