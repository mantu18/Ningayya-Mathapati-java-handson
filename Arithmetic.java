package nin.com;

import java.util.Scanner;

public class Arithmetic implements ArithmeticOperation {
	static ArithmeticOperation add=(a,b)->a+b;
	static ArithmeticOperation minus=(a,b)->a-b;
	static ArithmeticOperation multiply=(a,b)->a*b;
	static ArithmeticOperation divide=(a,b)->{
		if(b!=0){
			return a/b;
		}
		else 
		{
			throw new IllegalArgumentException("Division by zero");
		}
	
	};
	
	public static double performOperation(double a, double b, ArithmeticOperation operation) {
        return operation.operate(a, b);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		double a=sc.nextDouble();
		System.out.println("enter b value");
		double b=sc.nextDouble();
		double addresult=performOperation(a,b, add);
		System.out.println(addresult);
		double minusresult=performOperation(a,b, minus);
		System.out.println(minusresult);
		double multiplyresult=performOperation(a,b, multiply);
		System.out.println(multiplyresult);
		double divideresult=performOperation(a,b, divide);
		System.out.println(divideresult);
	}

	@Override
	public double operate(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
}
