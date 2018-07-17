package baekjoon;

import java.util.Scanner;

//백준 2292 벌집

class beehive{
	

	public static void main (String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0;
		int t = 1;
		
		while(true) {
			k += t;
			if(1+6*(k-t) < num && 1+6*k > num)
				break;
			else if (num == 1) {
				t = 0;
				break;
			}
			else
				t++;
			
		}
		
		
		System.out.print(t + 1);
	}
	
}