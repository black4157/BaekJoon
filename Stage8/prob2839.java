import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2839 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int three = 0;
		int five = 0;
		
		while( n % 5 != 0 && n >= 0 ) {
			n -= 3;
			three++;
		}
		
		if( n < 0 ) bw.write("-1"); 
		else {
			five = n / 5;
			bw.write(String.valueOf(three + five));
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
