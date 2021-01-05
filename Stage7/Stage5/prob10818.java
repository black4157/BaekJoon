import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class prob10818 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<a.length;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int min= a[0];
		int max= a[0];
		for(int i = 0; i<a.length;i++) {
			if(max < a[i]) max = a[i];
			if(min > a[i]) min = a[i];
		}
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}
