import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str_n = br.readLine();
		int n_length = str_n.length();
		int n = Integer.parseInt(str_n);
		int constuctor = 0;
		
		for(int i = (n-(n_length * 9)); i < n; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if(sum + i == n) {
				constuctor = i;
				break;
			}
		}
		
		System.out.println(constuctor);
		
	}
	
}
