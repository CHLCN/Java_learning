package bubbleSort;

import java.util.Scanner;

public class bubbleSort718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numbers[] = new int[10];
		System.out.print("Please input the numebrs: ");
		for ( int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		BubbleSort(numbers);
		System.out.print("The sorted numbers' order is: ");
		for ( int i: numbers) {
			System.out.print(i+" ");
		}
	}
	
	public static void BubbleSort(int[] list) {
		int tmp;
		// find if the numbers after the current number are less than it
		for ( int i = 0; i < list.length-1; i++) {
			for ( int j = i+1; j < list.length; j++) {
				if (list[i]>list[j]) {
					tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
				}
				// if the following numbers are lower, exchange them
			}
			
		}
	}

}
