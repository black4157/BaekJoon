import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prob1929 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		boolean a[] = new boolean[n+1];
		Arrays.fill(a, true);
		a[0] = false;
		a[1] = false;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; i*j <= n; j++) {
				a[i*j] = false;
			}
		}
		
		for(int i = m; i <= n; i++) 
			if(a[i] == true) System.out.println(i);
	}
}
