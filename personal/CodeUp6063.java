package codeup;

import java.util.Scanner;

public class CodeUp6063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = (a > b) ? a:b;
		
		System.out.println(c);
	}
	
}