package countNumbers;

import java.util.Scanner;

public class countNumbers73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		int[] countArray = new int[101]; // The array which is used to count numbers
		for (int i: countArray){
			i = 0;
		}
		// set all the counters to 0
		System.out.print("Enter the integers between 1 and 100: ");
		num = input.nextInt();
		
		while(num != 0) {
			if ( num >= 1 && num <= 100){
				countArray[num]++;
			} // count the numbers
			else {
				System.out.println("The input is out of range.");
				System.exit(0);
			}
			num = input.nextInt();
		}
		for (int i = 1; i <= 100; i++) {
			if(countArray[i] != 0){
				if (countArray[i] == 1)
					System.out.println(i + " occurs "+ countArray[i] + " time");
				else
					System.out.println(i + " occurs "+ countArray[i] + " times");
			}
			//only output the numbers which were input
		}
		
	}

}
