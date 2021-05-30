import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//카드 개수
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int sum = 0;
		int[] a = new int[n];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					if(a[i] + a[j] + a[k] <= m && a[i] + a[j] + a[k] > sum) sum = a[i] + a[j] + a[k];
				}
			}
		}
		
		System.out.println(sum);
	}
	
}
