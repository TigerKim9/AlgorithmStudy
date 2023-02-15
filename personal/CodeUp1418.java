package personal;

import java.util.Scanner;

public class CodeUp1418 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
			String str = sc.next();
			
			char [] spstr = str.toCharArray();
			
			
			//find t
			for (int i = 0; i < spstr.length; i++) {
				if(spstr[i] == 't') {
					System.out.printf("%d ",i + 1);
				}
			}
		sc.close();
	}

}