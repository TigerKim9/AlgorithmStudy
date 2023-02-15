package personal;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1610 {

	static void mysubstring(String str, int start, int count) {
		
		StringBuilder sb = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
		
		String [] stra = str.split("");
//		sb.append(str);
		System.out.println(Arrays.toString(stra));
		for (int i = start; i < start+count; i++) {
			System.out.print(stra[i]);
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int start = sc.nextInt();
		int count = sc.nextInt();
		
		mysubstring(str, start, count);
	}
	
}