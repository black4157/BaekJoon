import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob4153 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0 && c==0) break;
			
			if(a > b) {
				if(a > c) {
					if(a*a == b*b + c*c) System.out.println("right");
					else System.out.println("wrong");
				} else {
					if(c*c == b*b + a*a) System.out.println("right");
					else System.out.println("wrong");
				}
			} else if(b > a) {
				if(b > c) { 
					if(b*b == a*a + c*c)  System.out.println("right");
					else System.out.println("wrong");
				} else {
					if(c*c == a*a + b*b)  System.out.println("right");
					else System.out.println("wrong");
				}
			}
		}
	}
}
