package corejava;

public class Substring {

	public static void main(String[] args) {
			
		String str="Siva1145";
		//String sub=str.substring(4, 8);
		//System.out.println(sub);
		String sub="";
		for(int i=4;i<str.length();i++)
		{
			 sub=sub+str.charAt(i);
			
			
		}
		System.out.println(sub);
	}

}
