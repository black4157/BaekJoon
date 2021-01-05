import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob4344 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int c = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i = 0; i < c; i++) {
			int sum = 0;
			double avg = 0;
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int[] array = new int[n];

			for(int j = 0; j < n; j++) {
				array[j] = Integer.parseInt(st.nextToken());
				sum += array[j];
			}
			
			avg = Math.round(sum / n);
			for(int j = 0; j < n; j++) {
				if(array[j] > avg) {
					count += 1;
				}
			}
			
			avg = (double)(count*100)/n;
			System.out.println(String.format("%.3f%%", avg));
			count = 0;

		}
	}

}
