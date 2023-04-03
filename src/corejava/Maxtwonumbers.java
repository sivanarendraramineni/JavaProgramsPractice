package corejava;

public class Maxtwonumbers {

	public static void main(String[] args) {
		 int a[]= {5,9,55,66,1,100};
		 int firstnum = 0,secondnum=0;
		 for(int i=0;i<a.length;i++)
		 {
			 if( firstnum<a[i]) {
				 secondnum=firstnum;
			 firstnum=a[i];
			 
			 }
		 else 
		if(secondnum<a[i])
		 {
			 secondnum=a[i];
		 }
	}
		 System.out.println(firstnum);
System.out.println(secondnum);
}
}
