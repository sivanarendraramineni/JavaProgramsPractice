package corejava;

public class Revsentence {

	public static void main(String[] args) {
		String str="Siva Narendra Ramineni";
		String rev="";
		String[] words=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i];
		}
			System.out.println(rev);	
	}

}
