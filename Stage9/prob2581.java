import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2581 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int Totalcount = 0;
		int min = n;
		int sum = 0;
		
		for(int i = m; i < n+1; i++) {
			int count = 0;
			
			for(int j = 2; j < i+1; j++) {
				if(i % j == 0) count++;
				if(count == 2) break;
			}
			
			if(count == 1) {
				sum += i;
				if(i < min) min = i;
				Totalcount++;
			}
		}
		
		if(Totalcount == 0) System.out.println("-1");
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
