import java.util.Scanner;

public class DoubleSum {
	public static void main(String[] args) {
		Double num1,num2,sum; // variable declaration
//		num1=num2=0;   //intialization
		
		//object creation
		Scanner in =new Scanner(System.in);
		//reading numbers
		System.out.println("enter first number");
		num1=in.nextDouble();
		System.out.println("enter second number");
		num2=in.nextDouble();
		//reasigenment
//		num1=100;
//		num2=200;
		sum=num1+num2;
		System.out.println("total="+sum);
		System.out.println("the sum of  "+num1+"  and  "+num2+"  is  "+sum);
	}

}