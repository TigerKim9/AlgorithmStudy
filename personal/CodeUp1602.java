package personal;

import java.util.Scanner;

public class CodeUp1602 {

	public static void result(String num) {

		StringBuilder sb = new StringBuilder();
		sb.append(num);
		if(num.startsWith("-")) {
			sb.replace(0, 1, "");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		sc.close();
		result(num);
		
	}
	
}