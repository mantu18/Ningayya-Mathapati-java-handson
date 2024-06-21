package nin.com;

import java.util.Scanner;



public class StringTestImpl implements StringTest {

    public static void main(String[] args) {
        
        StringTest strTest = s -> {
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equals(reversed);
        };

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter a word to search for: ");
        String word = sc.nextLine();
        StringTest containWord = s -> s.contains(word);

        
        System.out.println("Palindrome check for '" + str1 + "': " + strTest.test(str1));
        System.out.println("Contain word '" + word + "' in '" + str1 + "': " + containWord.test(str1));

        sc.close();
        
    }

	@Override
	public boolean test(String s) {
		// TODO Auto-generated method stub
		return false;
	}

    
}
