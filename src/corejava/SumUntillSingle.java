package corejava;

public class SumUntillSingle {
     
	public int sumdigit(int n)
	{
		int sum=0;
		while(n>0 || sum>9)
		{
			if(n==0)
			{
				n=sum;
				sum=0;
			}
			else {
				sum=sum+n%10;
				n=n/10;
						
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		 int n=1234;
		 SumUntillSingle sumdi=new SumUntillSingle();
		 System.out.println(sumdi.sumdigit(n));
		 
	}

}
