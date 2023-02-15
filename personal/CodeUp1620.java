package personal;

import java.util.Scanner;

public class CodeUp1620 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		String [] snum = null;

		while(true) {
			int i = 0;
			if(num.length() < 2) {
				System.out.println(num);
				break;
			}
			snum = num.split("", num.length());
			for(String idx : snum) {
				i += Integer.parseInt(idx);
			}
			num = Integer.toString(i);
		}
		
		
		sc.close();
	}
}
