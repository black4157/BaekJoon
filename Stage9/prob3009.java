import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob3009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] a= {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] b= {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] c= {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

		int countx, county = 0;

		if(a[0] == b[0]) countx = c[0];
		else if(a[0] == c[0]) countx = b[0];
		else countx = a[0];
		
		if(a[1] == b[1]) county = c[1];
		else if(a[1] == c[1]) county = b[1];
		else county = a[1];
		
		System.out.println(countx + " " + county);
	}
}
