package corejava;

import java.util.Arrays;

public class Secondlargearray {
	
		static  void printSecondLargest(int arr[]){
		int size = arr.length;
		/*if(size<2) {
		System.out.println("Invalid input");
		return;
		}*/
		Arrays.sort(arr);
		for(int i = size-2 ; i>=0;i--) {
		if(arr[i] != arr[size-1]) {
		System.out.println("The second largest element is: " +arr[i]);
		return;
		}
		}
		//System.out.println("There is no second largest element");
		}

		public static void main(String[] args) {
			int array[] = {1,2,3,4,5,6,7,7,7};
			Secondlargearray sl=new Secondlargearray();
			
			printSecondLargest(array);
			}
	}

	
		

