package corejava;

import java.util.Scanner;

public class TackInputvalues {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter third number");
		int c=sc.nextInt();
		int d=a+b+c;
		System.out.println("Sum of these numbers"+d);
		
		System.out.println("enter the tring");
		String str=sc.next();
		System.out.println(str);
		
		

	}

}
