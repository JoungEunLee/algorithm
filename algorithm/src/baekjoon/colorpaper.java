package baekjoon;

import java.util.Scanner;

//백준 10163 색종이

class colorpaper{
	
	static int array[][] = new int [102][102];

	
	public static void main (String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		
		while (num <= n) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int h = sc.nextInt();
			int v = sc.nextInt();
			
			for(int a = 0; a < v; a++) {
				for(int b = 0; b < h; b++) {
					array[x+a][y+b] = num;
				}
			}
			num++;
		}
		
		
		
		
		for(int z = 1; z <= n; z++) {
			int count = 0;
			for(int i = 0; i < 102; i++) {
				for(int j = 0; j< 102; j++) {
					if(array[i][j] == z)
						count++;
				}
			}
			System.out.println(count);
		}
		
	}

	
}