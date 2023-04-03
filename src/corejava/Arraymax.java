package corejava;

public class Arraymax {

	public static void main(String[] args) {
		int a[]= {32,21,12,88,109};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
       System.out.println(max);
       
       int min=a[0];
       for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
      System.out.println(min);
       
	}
	

}
