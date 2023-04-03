package corejava;

public class Missingeleinarray {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,5};
		int n=5;
		int totalum=n*(n+1)/2;
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int missele=totalum-sum;
		System.out.println(missele);
	}

}
