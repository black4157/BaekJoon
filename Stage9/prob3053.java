import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob3053 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double r = Double.parseDouble(br.readLine());
		
		System.out.println(Math.PI*r*r);
		System.out.println(2*r*r);
	}
}
