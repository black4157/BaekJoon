import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class prob7568 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] weight = new int[n];
		int[] height = new int[n];
		int[] score = new int[n];
		Arrays.fill(score, 1);
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++) {
				if(weight[i] <= weight[j] && height[i] >= height[j] || weight[i] >= weight[j] && height[i] <= height[j]) {
					continue;
				} else if(weight[i] >= weight[j] && height[i] >= height[j]){
					score[j]++;
				} else {
					score[i]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(score[i] + " ");
		}
		
	}
}
