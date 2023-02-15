package personal;

import java.util.Scanner;

public class CodeUp1615 {

	public static int d(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static int selfnumber(int n) {// 2
		for (int i = 1; i <= n; i++) {
			int tmpN = i;
			int tmpV = 0;

			// 각 자릿수를 tmpV에 더한다
			while (tmpN > 0) {
				tmpV += tmpN % 10;
				tmpN /= 10;
			}
			// 제네레이터를 찾을 경우
			if (tmpV + i == n)
				return 0;
		}
		return n;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int num = 0;
		
		for(int i = a; i <=b; i++) {
			num +=selfnumber(i);
		}
		System.out.println(num);
	}
}
//		HashSet<Integer> set = new HashSet<>();
//		HashSet<Integer> allNum = new HashSet<>();
//		System.out.println(selfnumber(a));
//		for (int i = a; i <= b; i++) {
//			set.add(d(i));//제너레이터의 모음..셀프넘버는 없음
//			allNum.add(i);
//		}
//		System.out.println(set);
//		System.out.println(allNum);
//		int sum = 0;
//		for (int i = a; i <= b; i++) {
//			if (allNum.contains(i)) {//2를 포함하지 않으면 더해야하는데...2가 없는데 더하고 있음.
//				System.out.println(i);
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		sc.close();