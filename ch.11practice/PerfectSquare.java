package perfectSquare;

import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		int mValue = m;
		int i = 2;
		int n = 1;
		int result;
		ArrayList<Integer> list = new ArrayList<>();
		int[] flag = new int[1000];
		while(m != 1) { // 从2开始，如果能被整除，则是m的因子，保存该因子和其出现次数
			if ( m % i == 0){
				list.add(i);
				m /= i;
				flag[i]++; //计数器
			}
			else // 如果不能被整除则说明该数  不是m的因子，自增1
				i++; 
		}
		for(int j = 0; j < 1000; j++){
			if(flag[j]%2==1){
				n = n * j;
			}
		}
		System.out.println("The smallest number n for m * n to be a perfect square is "+n);
		result = mValue * n;
		System.out.println("m * n is " + result);
	}
}
