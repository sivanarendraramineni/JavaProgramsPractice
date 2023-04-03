package corejava;

import java.util.Arrays;

public class Maxtwonum {

	public static void main(String[] args) {
		 
		int a[]= {2,5,1,99,88,22};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
			System.out.println(a[i]);
			
			
			}
		
		
		}
		
		
	}

