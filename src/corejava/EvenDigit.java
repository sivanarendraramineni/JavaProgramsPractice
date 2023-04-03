package corejava;

public class EvenDigit {

	public static void main(String[] args) {
		 int n=92468;
		 int rem=0;
		 boolean flag=false;
		 while(n>0) {
			  rem=n%10;
			  n=n/10;
			  if(rem%2!=0)
				  flag=true;
			  break;
			 
		 }
		 if(flag==true) {
			 System.out.println("false");
		 }
		 else
		 {
			 System.out.println("true");
		 }

	}

}
