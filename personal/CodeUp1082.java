package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1082 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		
		for(int i = 1; i <16;i++) {
			System.out.printf("%s*%s=%s\n",num,Integer.toHexString(i).toUpperCase(),Integer.toHexString(i * Integer.parseInt(num,16)).toUpperCase());
		}
		br.close();
		
	}

}