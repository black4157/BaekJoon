import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1065 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(seq(n));
	}
	
	public static int seq(int n) {
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(i<100) count ++;
			else if(i>1001) break;
			else {
				int[] array = new int [3];
				array[0] = i / 100;
				array[1] = (i / 10) % 10;
				array[2] = i % 10;
				if(array[1] - array[0] == array[2] - array[1]) {
					count++;
				}
			}
		}
		return count;
	}
}
