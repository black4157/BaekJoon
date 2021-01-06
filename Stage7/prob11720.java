import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob11720 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		int sum = 0;
		String a = br.readLine();
		for(int i = 0; i < n; i++) {
			array[i] = a.charAt(i) - '0';
			sum += array[i];
		}
		
		System.out.print(sum);
	}
}
 