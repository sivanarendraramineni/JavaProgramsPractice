package corejava;

public class Pattern1 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1;i<=n-1;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
