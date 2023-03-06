package programmers;

import java.util.*;

public class Programmers42578 {

	public static int solution(String[][] clothes) {
		int answer = 0;
		
		HashMap<String, String> map = new HashMap<>();
		
//		map.
		System.out.println(clothes.length);
		System.out.println(clothes[0][0]);
		System.out.println(Arrays.toString(clothes[0]));
		
		for(String[] clothe : clothes) {
			System.out.println("2차원에서 뺐어 = "+ clothe);
			for(String c : clothe) {
				System.out.println("1차원에서 뺐어 = "+ c);
				map.put(c));
				
			}
		}
		System.out.println(map);
		
		return answer;
	}

	public static void main(String[] args) {
		String[][] clothes = new String[][] {{ "yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear" }};
//
		System.out.println(solution(clothes));
	}
}
