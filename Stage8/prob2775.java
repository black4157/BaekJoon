import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class prob2775 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int[][] apt = new int[15][15];
			
			//ÃÊ±âÈ­
			for(int j = 1; j < 15; j++) {
				apt[j][1] = 1;
				apt[0][j] = j;
			}
			
			// ÇöÀçÃþ, È£ = [Ãþ-1][È£] + [Ãþ][È£-1]
			for(int j = 1; j < 15; j++) {
				for(int m = 2; m < 15; m++) {
					apt[j][m] = apt[j-1][m] + apt[j][m-1];
				}
			}
			bw.write(String.valueOf(apt[k][n]));
			bw.newLine();
			//System.out.println(apt[k][n]);
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
