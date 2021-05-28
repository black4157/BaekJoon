import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2447 {
	static char[][] a;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		a = new char[n][n];
		
		star(0, 0, n, false);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sb.append(a[i][j]);
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
	
	static void star (int x, int y, int n, boolean blank) {
		//5번째 공백 출력
		if(blank) {
			for(int i = x; i < x+n; i++) {
				for(int j = y; j < y+n; j++) {
					a[i][j] = ' ';
				}
			}
			return;
		}
		
		//5번째를 제외한 모두 별표 출력
		if(n==1) {
			a[x][y] = '*';
			return;
		}
		
		//재귀, 큰 판에서 나누어 작은 판으로 
		int size = n/3;
		int count = 0;
		for(int i = x; i < x+n; i += size) {
			for(int j = y; j < y+n; j += size) {
				count++;
				if(count == 5) {
					star(i,j,size,true);
				} else {
					star(i,j,size,false);
				}
			}
		}
	}
}
