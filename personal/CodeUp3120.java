package personal;

import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CodeUp3120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int target = sc.nextInt();
		int diff = Math.abs(target - n);
		int count = 0;
		System.out.pr intln(diff);
		Integer[] button = { 10, 5, 1, -1, -5, -10 };

		for (int bt : button) {

			count += diff / bt;
			diff %= bt;
		}

		System.out.println(Math.abs(count));
		sc.close();
	}

}