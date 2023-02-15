package personal;

public class Math {
	public static void main(String[] args) {
		
		long n = onetonumplus(1000000);
		System.out.println(n);
	}



public static long onetonumplus(long num){
	return ((num + 1) * num) / 2;
}
}