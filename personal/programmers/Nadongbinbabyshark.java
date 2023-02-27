package programmers;

import java.util.*;

public class Nadongbinbabyshark {

	public static int[] solution(int map) {
        int[] answer = {};
        map = 4;
        
        int [][] mapsize = new int[map][2];
        System.out.println(mapsize.length);
        for (int i = 0; i < map; i++) {
			for (int j = 0; j < 2; j++) {
				mapsize[i][j] = i;
			}
		}
        System.out.println();
        
//        for (int i = 0; i < mapsize.length; i++) {
//			
//		}
       
        return answer;
    }
	public static void main(String[] args) {
		String[] genres = new String[] { "classic", "pop", "classic", "classic", "pop" };
		int [] plays = new int [] {500, 600, 150, 800, 2500};
		System.out.println(solution(4));
	}
}
