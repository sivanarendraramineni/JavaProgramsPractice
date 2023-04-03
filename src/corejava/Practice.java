package corejava;

import java.util.Scanner;

public class Practice {
	
	public int add(int a,int b,int c) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int x=sc.nextInt();
		System.out.println("enter second number");
		int y=sc.nextInt();
		System.out.println("enter third number");
		int z=sc.nextInt();
		int d=a+b+c;
		System.out.println("Sum of these numbers"+d);
		
		return d;  
	}

	public static void main(String[] args) {
		
		Practice pc=new Practice();
		  
		}
	}


