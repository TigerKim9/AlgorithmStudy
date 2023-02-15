package personal;

import java.util.Scanner;

public class CodeUp1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		while(i<=num) {
			if(i % 3 == 0) {
				System.out.printf("X ");				
			}else {				
				System.out.printf("%d ",i);
			}
			i++;
		}
		
		
		
		sc.close();
	}

}