package personal;

import java.util.Scanner;

public class CodeUp1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "";
		s.contains("q");
		while(true) {
			String a = sc.next();
			s +=a;
			if(s.contains("q")) {
				char [] charr = s.toCharArray();
				for(int i = 0; i<charr.length;i++) {
					System.out.println(charr[i]);
					if(charr[i] == 'q') {
						break;
					}
					
				}
				break;
			}
		}
	sc.close();
	}

}