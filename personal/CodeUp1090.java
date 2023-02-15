package personal;

import java.util.Scanner;

public class CodeUp1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextInt();
		long d = sc.nextInt();
		long n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			a *= d;
		}
		System.out.println(a);
		sc.close();
	}

}