package personal;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] stu = new int [n];
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = sc.nextInt();
		}
		Arrays.sort(stu);
		
		System.out.println(stu[0]);
		
		sc.close();
	}

}