import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob10870 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-2) + fibonacci(n-1); 
	}
}
