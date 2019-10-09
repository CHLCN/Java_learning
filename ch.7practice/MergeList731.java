package mergeList;

import java.util.Scanner;

public class MergeList731 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1,num2;
		System.out.print("Please input first list: ");
		num1 = input.nextInt();
		int[] list1 = new int[num1];
		for ( int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}
		
		System.out.print("Please input second list: ");
		num2 = input.nextInt();
		int[] list2 = new int[num2];
		for ( int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}
		
		int [] list = merge(list1,list2);
		System.out.print("The merged list is ");
		for ( int i: list)
			System.out.print(i+" ");
		
	}
	
	public static int[] merge(int[] list1, int[] list2) {
		int i = 0; 
		int j = 0;
		int k = 0;
		int[] list = new int [list1.length + list2.length];
		while(i < list1.length && j <list2.length) {
			// find the smaller number, add it in list
			if(list1[i] < list2[j]) {
				list[k++] = list1[i++];
			}
			else {
				list[k++] = list2[j++];
			}
		}
		// if list1 is longer, add the rest to list
		while(i < list1.length) {
			list[k++] = list1[i++];
		}
		while(j < list2.length) {
			list[k++] = list2[j++];
		}
		return list;
	}
}
