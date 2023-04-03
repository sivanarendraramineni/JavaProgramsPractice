package corejava;

public class Arraypair {

	public static void main(String[] args) {
		
		int a[]={3, 7, 4, 5, 6, 8, 1, 2};
		int sum=8;
		for(int i=0;i<a.length;i++)
		{
		  for(int j=i+1;j<a.length;j++)
		{
		  if(sum==a[i]+a[j])
		{
		 System.out.println(a[i]+","+ a[j]);
		}
		}


		}
	}

}
