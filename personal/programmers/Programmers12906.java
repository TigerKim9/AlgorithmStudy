package programmers;

import java.util.*;

public class Programmers12906 {

	public static int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int ar : arr) {
        	if(stack.isEmpty()) {
        		stack.push(ar);
        	}else if(stack.peek() != ar) {
        		stack.push(ar);
        	}
        }
        answer = new int[stack.size()];
        
        for(int i = answer.length-1;i>=0;i--) {
        	answer[i] = stack.pop();
        }
        return answer;
    }
	public static void main(String[] args) {
//		String[] genres = new String[] { "classic", "pop", "classic", "classic", "pop" };
		int [] plays = new int [] {500, 600, 150, 800, 2500};
		System.out.println(solution(plays));
	}
}
