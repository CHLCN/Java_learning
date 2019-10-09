package sortString;

import java.util.Scanner;

public class SortString734 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a string: ");
		String s = input.next();
		System.out.print("The sorted string is: ");
		System.out.print(sort(s));
	
	}
	
	public static String sort(String s) {
		// insert sort
		char[] ch = s.toCharArray();
		char tmp;
		int j;
		
		for ( int i = 1; i < ch.length; i++) {
			tmp = ch[i];
			// get current character
			for (j = i; j > 0 && tmp < ch[j-1]; j--) {
				ch[j] = ch[j-1];
				// if last character bigger than current one, assign its value to current character
			}
			ch[j] = tmp;
			// swap done
		}
		String s1 = new String(ch);
		return s1;
	}

}
