import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class prob4948 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) break;
			
			boolean a[] = new boolean[246913];
			Arrays.fill(a, true);
			a[0] = false;
			
			int count = 0; 
			
			for(int i = 2; i <= 2*n; i++) {
				for(int j = 2; i*j <= 2*n; j++) {
					a[i*j] = false;
				}
			}
			
			for(int i = n+1; i <= 2*n; i++) {
				if(a[i]==true) {
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}
