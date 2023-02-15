package personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//코드업 입체기동장치
/*
 * 입체기동장치 생산공장에서는 거인들을 물리치기 위한 기계가 생산되고 있습니다.

이 공장을 운영하는 에렌은 입체기동장치(1~100)의 식별번호(1~100)와 가스 보유량(0~10000)을 같이 관리하려고 합니다.

하지만, 식별번호를 정렬할 때 가스 보유량이 뒤죽박죽 되어 버려 골머리를 앓고 있습니다.

에렌을 남몰래 좋아하고 있던 미카사는 에렌이 스트레스성 탈모로 잔머리가 모두 빠지기 전에 이 문제를 해결해주려 합니다.

미카사가 에렌의 스트레스성 탈모를 막을 수 있도록 프로그램을 작성해세요.

식별번호가 한번 정해지면 그 입체기동장치의 가스 보유량은 정렬되더라도 변하지 않아야 합니다.



입력
첫째 줄에 입체기동장치의 갯수 n이 입력된다. (1 <= n <= 100)

둘째 줄부터 n+1째 줄까지 각 줄에 입체기동장치의 식별번호 a와 가스 보유량 b가 주어진다.

a는 중복 될 수 없지만 b는 중복될 수 있다. (1 <= a <= 100), (0 <= b <= 10,000)
 */


public class CodeUp1805 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		HashMap<Integer,Integer> ipche = new HashMap<>();
		//키값만을 위한 배열
		int [] keys = new int[a];
		int i = 0;
		while(i < a) {
			int num = sc.nextInt();
			int gas = sc.nextInt();
			//키값을 따로 받아준다.
			keys[i] += num;
			//입력받은 값은 바로바로 넣어준다.
			ipche.put(num, gas);
			i++;
			
		}
		//key값 정렬
		Arrays.sort(keys);
		
		for(int j = 0; j < a; j++) {
			System.out.println(keys[j] + " " + ipche.get(keys[j]));			
		}
		
		sc.close();
	}

}