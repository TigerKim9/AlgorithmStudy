package personal;

import java.util.Scanner;



public class CodeUp2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float pasta1 = sc.nextInt();
		float pasta2 = sc.nextInt();
		float pasta3 = sc.nextInt();
		float juice1 = sc.nextInt();
		float juice2 = sc.nextInt();
		float pasta = 0;
		float juice = 0;
		sc.close();
		if(pasta1 < pasta2) {
			pasta = pasta1;
		}else {
			pasta = pasta2;
		}
		
		if(pasta < pasta3) {
			
		}else {
			pasta = pasta3;
		}
		
		if(juice1 < juice2) {
			juice = juice1;
		}else {
			juice = juice2;
		}
		
		System.out.printf("%.1f", pasta + juice + (pasta + juice)*0.1);
		sc.close();
	}

}