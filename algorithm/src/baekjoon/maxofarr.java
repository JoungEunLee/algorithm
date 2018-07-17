package baekjoon;

import java.util.Scanner;


//백준 2566 최댓값

class maxofarr{
	
	static int array[][] = new int [9][9];
	
	public static void main (String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		int max = 0;
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(array[i][j] > max) {
					max = array[i][j];
					x = i+1;
					y = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(x + " " + y);

	}
	
}