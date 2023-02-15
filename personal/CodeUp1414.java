package personal;

import java.util.Scanner;

public class CodeUp1414 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
			String str = sc.next();
			
			char [] spstr = str.toCharArray();
			
			int c = 0;
			int cc = 0;
			
			for (int i = 0; i < spstr.length; i++) {
				if(spstr[i]=='c' || spstr[i] =='C') {
					c++;
				}
				if(i == spstr.length -1) break;
				if((spstr[i] == 'c' || spstr[i] =='C') && (spstr[i+1] =='c' || spstr[i+1] =='C')) {
					cc++;
				}
			}
			System.out.println(c);
			System.out.println(cc);
		sc.close();
	}

}