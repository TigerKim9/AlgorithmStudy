package programmers;

import java.util.*;

public class Programmers42577 {

	public static boolean solution(String[] phonebook) {
		boolean answer = true;

		int cnt = 0;
		Arrays.sort(phonebook);
//        HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < phonebook.length; i++) {
			if(phonebook[i+1].startsWith(phonebook[i])) {
				return false;
			}
		}

//        for(String pb : phonebook) {
//        	map.put(pb,1);
//        }
//        for(String key : map.keySet()) {
//        	if(key.startsWith(key)) {
//        		
//        	}
//        }
		if (cnt > phonebook.length) {
			answer = false;
		} else {
			answer = true;
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] phonebook = new String[] { "123", "456", "789" };

		System.out.println(solution(phonebook));
	}
}
