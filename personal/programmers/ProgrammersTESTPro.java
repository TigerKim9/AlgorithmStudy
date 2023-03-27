package programmers;

import java.util.*;

public class ProgrammersTESTPro {

	public static int[] solution(int[] arr) {
        int[] answer = {0,0};
        answer[0] = arr[0]^arr[1]^arr[2];
        Arrays.sort(arr);
        return answer;
    }
	public static void main(String[] args) {
		int [] plays = new int [] {10, 2, 3, 800, 2500};
		System.out.println(Arrays.toString(solution(plays)));
	}
}
