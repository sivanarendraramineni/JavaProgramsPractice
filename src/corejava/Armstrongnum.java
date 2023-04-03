package corejava;

public class Armstrongnum {

	public static void main(String[] args) {
		int n=1531;
		int original=n;
		int cube=0;
		while(n>0)
		{
			int rem=n%10;
			cube=cube+(rem*rem*rem);
			n=n/10;
			
		}
		if(original==cube)
		{
			System.out.println(original+" is armstrong nunber");	
		}
		else
		{
			System.out.println(original+" is not armstrong nunber");
		}
	}

}
