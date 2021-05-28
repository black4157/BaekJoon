import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		bw.write( (int)(Math.pow(2, n) - 1) + "\n");
		
		Hanoi(n,1,2,3);
		
		bw.flush();
		bw.close();
	}
	
	public static void Hanoi(int n, int start, int mid, int to) throws Exception{
		
		//원판 1개
		if(n==1) {
			bw.write(start + " " + to + "\n");
			return;
		}
		
		//n-1개를 a에서 b로 이동
		Hanoi(n-1, start, to, mid);
		
		//1개를 a에서 c로 이동
		bw.write(start + " " + to + "\n");
		
		//n-1개를 b에서 c로 이동
		Hanoi(n-1, mid, start, to);
	}
}
