import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1193 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		//i = 대각선의 숫자 개수, j = 직전 대각선의 개수의 합
		int i = 1, j = 0;
		
		while (true) {
			if(x <= i + j) {
				
				//i가 홀수일 때 ==> 짝수층
				if(i % 2 == 1) {
					System.out.print((i- (x-j-1)) + "/" + (x-j));
					break;
				} 
				
				//i가 짝수일 때 ==> 홀수층
				else {
					System.out.print((x-j) + "/" + (i- (x-j-1)));
					break;
				}
			} else {
				j += i;
				i++;
			}
		}
	}
}
