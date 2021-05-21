import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob11653 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int i = 2;
		
		while(n > 1) {
			if(n % i == 0) {
				System.out.println(i);
				n = n / i;
				i = 2;
				continue;
			}
			i++;
		}
	}
}
