import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2480 {
	public void solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		try {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int max = max(a, b, c);

			if (a==b && b==c) {
				System.out.println(sb.append(10000 + a * 1000));
			} else if (a==b || a==c) {
				System.out.println(sb.append(1000 + a * 100));
			} else if (a==b || b==c) {
				System.out.println(sb.append(1000 + b * 100));
			} else {
				System.out.println(sb.append(max * 100));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int max(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		} else {
			if (b > c) {
				return b;
			} else {
				return c;
			}
		}
	}
	
	public static void main(String[] args) {
		prob2480 prob = new prob2480();
		prob.solution();
	}
}
