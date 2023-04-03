package corejava;

public class Reverseeachword {

	public static void main(String[] args) {
		
	String str=" RAmineni Siva NArendra";
	String Revstr="";
	String[] words=str.split(" ");
	
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String reveword="";
		for(int j=word.length()-1;j>=0;j--)
		{
			reveword=reveword+word.charAt(j);
			
		}
		Revstr=Revstr+reveword+" ";
	}
	System.out.println(str);
	System.out.println(Revstr);
	
	}

}
