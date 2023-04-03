package corejava;

public class Dupchar {
	   public static void main(String argu[]) {
	      String str = "beautiful beach";
	      int count=0;
	      char[] carray = str.toCharArray();
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.println(carray[j] + " "+ count);
	           
	               count++;
	               
	               break;
	            }
	         }
	      }
	      System.out.println(count);
	   }
	}