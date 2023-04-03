package corejava;

public class Duparray {

	public static void main(String[] args) {
		String a[]= {"java","c","java","python"};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					System.out.println("Duplicate element found");
					flag=true;
					
				}
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate  not element found");
		}
	}

}
