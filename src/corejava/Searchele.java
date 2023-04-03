package corejava;

public class Searchele {

	public static void main(String[] args) {
		int a[]= {22,89,74,99,1,5};
		int seaele=10;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==seaele){
				
				System.out.println(seaele+"Element found");
				flag=true;
			}
			
			
		}
		if(flag==false)
		{
			System.out.println(seaele+"Element not found");

		}

	}

}
