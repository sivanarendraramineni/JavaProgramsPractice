package corejava;

public class Parrern {

	public static void main(String[] args) {
		
		int k=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println(" ");
			
			
		}
		int l=1;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println(" ");
			
		}
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
			System.out.print("\t");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<5;i++) {
			
			for(int j=5-i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
