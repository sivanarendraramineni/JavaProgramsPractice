package corejava;

public class Dupele {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,5,9,8,2};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+"duplicate ele found");
					flag=true;
					
				}
			}
			
		}
		if(flag==true)
		{
			System.out.println("duplicate ele found");
		}
		else
		{
			System.out.println("duplicate ele not found");
		}
	}

}
