import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob1546 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		int max = 0;
		double sum = 0.0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			sum += array[i];
			if(array[i] > max) max=array[i];
		}
		
		System.out.println( ( (sum * 100) / max ) / array.length);
	}
}
