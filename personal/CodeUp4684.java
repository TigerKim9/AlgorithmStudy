package codeup;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp4684 {
	
	public static int [] right(int [] lock) {//오른쪽으로 한칸
		int n = lock.length;
		int temp = lock[n-1];
		for (int i = n -1; i >= 1; i--) {
			lock[i] = lock[i-1];
		}
		
		lock[0] = temp;
		return lock;
//		System.out.println("right "+Arrays.toString(lock));
	}
	public static int [] left(int [] lock) {//왼쪽으로 한칸
		int n = lock.length;
		int temp = lock[0];
		for (int i = 0; i < n; i++) {
			if(i == n-1) break;
			lock[i] = lock[i+1];
		}
		lock[n-1] = temp;
		return lock;
//		System.out.println("left" + Arrays.toString(lock));
	}
	static int [] reverse(int [] lock, int p, int q) {
		int [] copy = Arrays.copyOfRange(lock, p -1, q);
		int len = copy.length;
		
		for(int i=0; i < len; i++) {
			lock[p -1 +i] = copy[len -(i+1)];
		}
		return lock;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int [] result = new int[n];
		
		int [] lock = new int[n];
		
//		for (int i = 0; i < n; i++) {
//			result[i] += sc.nextInt();
//		}
//		System.out.println(Arrays.toString(result));
		for (int i = 0; i < n; i++) {
			lock[i] += i +1;
		}
		System.out.println(Arrays.toString(lock));
//		System.out.println(Arrays.toString(reverse(lock,1,3)));
		System.out.println(Arrays.toString(right(lock)));
		sc.close();
		
	}
}
