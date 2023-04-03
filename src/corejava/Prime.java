package corejava;

public class Prime {

	public static void main(String[] args) {
		int n=24;
		int count=0;
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(n+"prime number");	
			}
			else
			{
				System.out.println(n+" not prime number");
			}
			
		}
		else
		{
			System.out.println(n+" not prime number");
		}
	}

}
