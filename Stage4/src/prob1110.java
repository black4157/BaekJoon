import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b=a, count=0, c ;
		while(true) {
			c = b/10 + b%10;
			b = b%10 * 10 + c%10;
			count++;
			if(a == b) break;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
