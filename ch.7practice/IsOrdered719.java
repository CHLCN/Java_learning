package isOrdered;

import java.util.Scanner;

public class IsOrdered719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: "); // 
		int num = input.nextInt();
		int[] list = new int[num];
		for( int i = 0; i < num; i++) {
			list[i] = input.nextInt();
		}
		if(!isSorted(list)) {
			System.out.println("The list is not sorted");
		}
		else
			System.out.println("The list is already sorted");
	}
	
	public static boolean isSorted(int[] list) {
		for ( int i = 0; i < list.length-1; i++) {
			for ( int j = i + 1; j < list.length; j++) {
				// if the following numbers are lower, then the list is not sorted
				if (list[i] > list[j])
					return false;
			}
		}
		return true;
	}

}
