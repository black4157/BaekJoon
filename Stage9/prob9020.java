import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class prob9020 {
	public static boolean[] a = new boolean[10001];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		prime();
		
		int t = Integer.parseInt(br.readLine());
		int x,y;
		
		while(t > 0) {
			int n = Integer.parseInt(br.readLine());
			x = y = n /2;
			
			while(true) {
				if(a[x] && a[y]) {
					sb.append(x).append(" ").append(y).append("\n");
					//System.out.println(x + " " + y);
					break;
				}
				x--;
				y++;
			}
			t--;
		}
		System.out.print(sb);
		br.close();
	}
	
	public static void prime() {
		Arrays.fill(a, true);
		a[0] = false;
		a[1] = false;
		
		for(int i = 2; i <= Math.sqrt(a.length); i++) {
			for(int j = i*i; j <  a.length; j += i) {
				a[j] = false;
			}
		}
	}
}
