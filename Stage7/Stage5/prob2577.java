import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2577 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int mul = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		int[] array = new int[10];

		while(mul != 0) {
			array[mul%10]++;
			mul /= 10;
		}
		
		for(int i : array) {
			System.out.println(i);
		}
	}
}
