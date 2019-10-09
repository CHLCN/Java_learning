package printNumbers;

import java.util.Scanner;

public class printNumbers75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int num;
		int countNum = 0; // count the distinct numbers 
		int isMoreThanOnce; // mark the numbers which appear more than once

		int[] recordNum = new int[10];
		for ( int i = 0 ; i < 10; i++) {
			num = input.nextInt();
			isMoreThanOnce = 0;
			for (int j = 0; j < i; j++) {
				if (recordNum[j] == num)
					isMoreThanOnce = 1;
			}
			// find if there are numbers equal to this number
			if (isMoreThanOnce == 0) {
				countNum++;
				recordNum[countNum-1] = num;
			}
		}
		System.out.println("The number of distinct number is " + countNum);
		System.out.print("The distinct numbers are: ");
		for ( int i = 0; i < countNum; i++) {
			System.out.print(recordNum[i]+" ");
		}
		
	}

}
