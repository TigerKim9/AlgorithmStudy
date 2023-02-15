package personal;

import java.util.Scanner;

public class CodeUp1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long day = 1;
		while(true) {
			if(day % a !=0 ||day%b!=0 || day%c!=0) {
				day++;
			}else {
				System.out.println(day);
				break;
			}
		}
		
		sc.close();
	}

}