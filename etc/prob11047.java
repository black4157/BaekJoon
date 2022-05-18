import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob11047 {

	public int solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int count = 0;
		
		try {
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[size];
			
			for(int i = 0; i < size; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}
				
			while(price != 0) {
				for(int i = size-1; i >= 0; i--) {
					if(price / arr[i] == 0) {
						continue;
					} else {
						count += price / arr[i];
						price %= arr[i];
					}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		prob11047 prob = new prob11047();
		System.out.println(prob.solution());
	}
}
