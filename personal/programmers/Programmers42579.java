package programmers;

import java.util.*;

public class Programmers42579 {

	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<Integer, String> genre = new HashMap<>();
        HashMap<Integer, Integer> play = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
			genre.put(i,genres[i]);
			play.put(i, plays[i]);
		}
        
        
        System.out.println(genre);
        System.out.println(play);
        return answer;
    }
	public static void main(String[] args) {
		String[] genres = new String[] { "classic", "pop", "classic", "classic", "pop" };
		int [] plays = new int [] {500, 600, 150, 800, 2500};
		System.out.println(Arrays.toString(solution(genres, plays)));
	}
}
