package corejava;

public class Revnum {

	public static void main(String[] args) {
	int n=123;
	int orinum=n;
	int rev=0;
	while(n!=0)
	{
		rev=rev*10+n%10;
		n=n/10;	
	}
	System.out.println(rev);
	
	if(orinum==rev)
	{
		System.out.println("number is palindrome");
	}
	else
	{
		System.out.println("number is not palindrome");
	}
	}

}
