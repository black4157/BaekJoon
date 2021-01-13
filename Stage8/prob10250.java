import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob10250 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken()); //사실상 필요없음
			int N = Integer.parseInt(st.nextToken());
			
			if( N % H == 0) {
				System.out.println( (H*100) + (N/H) );
			} else {
				System.out.println( ( (N%H) * 100) + ( (N/H) + 1 ) );
			}
		}
	}
}
