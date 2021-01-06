import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob10809 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String[] array = new String[26];
		array = alpa.split("");
		
		String input = br.readLine();
		
		for(int i = 0; i < 26; i++) {
			System.out.print(input.indexOf(array[i]) + " ");
		}
	}
}
 