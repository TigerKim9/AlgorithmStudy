package personal;

import java.util.Scanner;

public class CodeUp1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;
		for (int i = 1; i <= a; i++) {
			b += i;
			if (b >= a) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}

}