package programmers;

import java.util.*;

public class Programmers42576 {
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
//        ArrayList<String> norun = new ArrayList<String>();
//        Arrays.sort(participant);
//        Arrays.sort(completion);
        LinkedList<String> norun = new LinkedList<String>();
        for(String p : participant) {
			norun.add(p);
		}
        
        for(String c : completion) {
        	norun.remove(c);
        }
//        
        System.out.println(norun.get(0));
//        System.out.println(norun.get(0));
        return answer;
    }
	

	public static void main(String[] args) {
		String [] participant = new String []{"leo", "kiki","kiki", "eden"};
		String [] completion = new String []{"eden", "kiki"};
				
		System.out.println(solution(participant,completion));
	}
}
