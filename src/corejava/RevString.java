package corejava;

public class RevString {

	public static void main(String[] args) {
		String str="madam";
		String ori_str=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
		
		if(ori_str.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("string is not palindrome");
		}
	}

}
