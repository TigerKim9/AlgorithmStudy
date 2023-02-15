package personal;

import java.util.Scanner;

public class CodeUp1419 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
			String str = sc.nextLine();

			String [] loves = str.split(" ");
			int count = 0;
			for(String love : loves) {
				if(love.contains("love")) {
					count++;
				}
			}
			
			
			System.out.println(count);
		sc.close();
	}

}