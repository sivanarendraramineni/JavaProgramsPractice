package corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Removeduparray {
	
	public static void removedupelenets(int a[]) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);   // this problem is solved by usingboth LinkedHashSet and HashSet
		}
		System.out.println(set);
	}

	public static void main(String[] args) {
		
		int a[]= {1,1,1,2,2,2,3,3,4,4,5,5,6,6};
		removedupelenets(a);

	}

}
