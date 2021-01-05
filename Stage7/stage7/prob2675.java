import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2675 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			String[] S = new String[s.length()];
			S = s.split("");
			int count = 0;
			for(int j = 0; j < S.length; j++) {
				for(int k = 0; k < r; k++) {
					System.out.print(S[count]);
				}
				count++;
			}
			System.out.println("");
		}
	}
}
