package corejava;

import java.util.Arrays;

public class Arraysort {

	public static void main(String[] args) {
		int a[]= {1,8,6,1,8,3,44,};
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
			
			
		}
System.out.println(Arrays.toString(a));
	}

}
