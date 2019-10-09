package rankStudents;

import java.util.Scanner;

public class rankStudents717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please input the number of students: ");
		int studentNum = input.nextInt();
		int currentStu = 0; // count the number of the student
		String[] name = new String[studentNum];
		int grade[] = new int[studentNum];
		int gradeRecord[] = new int[studentNum]; // to record the origin order of the input
		
		
		for ( int i = 0; i < studentNum; i++) {
			currentStu++;
			System.out.println("Please input the name of the " + currentStu + " student: ");
			name[i] = input.next();
			System.out.println("Please input the grade of the " + currentStu + " student: ");
			grade[i] = input.nextInt();
			gradeRecord[i] = grade[i];
			
		}
		SelectionSort(grade);
		System.out.print("The total rank is: ");
		for ( int i = 0; i < studentNum; i++) {
			for ( int j = 0; j < studentNum; j++) {
				if (grade[i] == gradeRecord[j]) {
					System.out.print(name[j] + " ");
					break;
				}
				// find the origin name of the sorted students
			}
			
		}
	}
	
	public static void SelectionSort(int[] list) {
		/* The method for sorting the numbers */
		for (int i = 0; i < list.length - 1; i++) {
		// Find the minimum in the list[i..list.length-1]
			int currentMax = list[i];
			int currentMaxIndex = i;
			
			for ( int j = i; j < list.length; j++) {
				if (currentMax < list[j] ) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}

}
