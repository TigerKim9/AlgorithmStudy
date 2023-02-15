package personal;

import java.util.Scanner;

public class CodeUp1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int n = sc.nextInt(), m = sc.nextInt();
		for (i = 1; i <= n; i++) {

			for (j = 1; j <= m; j++) {

				System.out.printf("%d %d\n", i, j);
			}
		}

		sc.close();
	}

}