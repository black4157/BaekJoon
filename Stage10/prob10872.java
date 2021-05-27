import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
		if(n>0) {
			return factorial(n-1) * n;
		} else {
			return 1;
		}
		
	}
}
