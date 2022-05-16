import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob25191 {
	
	public int solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int count = 0;
		
		try {
			int chicken = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int cola = Integer.parseInt(st.nextToken());
			int beer = Integer.parseInt(st.nextToken());

			count = cola/2 <= chicken ? cola/2 : chicken;
			int temp = count < chicken ? ((count + beer < chicken) ? beer : chicken-count) : 0;
			count += temp;
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		prob25191 prob = new prob25191();
		System.out.println(prob.solution());
	}
}
