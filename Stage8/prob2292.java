import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2292 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int floor = 1;
		int plus = 2;
		
		if(n == 1) System.out.print(1);
		else {
			while(plus <= n) {
				plus = plus + (6 * floor);
				floor++;
			}
			System.out.print(floor);
		}
	}
}
