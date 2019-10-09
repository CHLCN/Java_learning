package partitionElement;

import java.util.Scanner;

public class PartitionElement732 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int num = input.nextInt();
		int[] list = new int[num];
		for ( int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		partition(list);
		System.out.print("After the partition, the list is ");
		for (int i: list)
			System.out.print(i+" ");
	}
	
	public static int partition(int[] list) {
		int key = list[0];
		int i = 0;
		int j = list.length -1 ;
		while (i < j) {
			while(list[j] > key && i < j)
				j--;
			// start from the last element, the break condition must be list[j]>key
			while(list[i] <= key && i < j)
				i++;
			swap(list,i,j);
			
		}
		swap(list,0,j);
		// list[j] is the number that less than list[0] and value is nearest to list[0]
		return j;
	}
	
	public static void swap(int[] list, int x, int y) {
		int tmp;
		tmp = list[x];
		list[x] = list[y];
		list[y] = tmp;
	}
}
