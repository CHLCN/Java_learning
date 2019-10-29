package location;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number fo rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];
		System.out.println("Enter the array: ");
		for (int i = 0; i < row; i++) {
			for ( int j = 0; j < column; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		Location location = Location.locateLargest(array);
		System.out.println("The location of the largest element is "+location.maxValue+" at ("+location.row+", "+location.column+")");
	}

}
