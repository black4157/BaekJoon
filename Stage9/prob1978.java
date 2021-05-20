import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1978 {
	public static void main(String[] agrs) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		int Totalcount = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		for(int i = 0; i < n; i++) {	
			int num = Integer.parseInt(st.nextToken());
			int count = 0;
			
			for(int j = 2; j < 1001; j++) {
				if(num % j == 0) count++;
				if(count > 2) break;
			}
			
			if(count == 1) Totalcount++;
		}
		
		System.out.println(Totalcount);
	}
}