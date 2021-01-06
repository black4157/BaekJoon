import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2908 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		for(int i = 0; i < num.length; i++) {
			String tmp = num[i].charAt(0)+"";
			String tmp2 = num[i].charAt(2)+"";
			num[i] = tmp2 + (num[i].charAt(1)+"") + tmp;
		}
		
		if(Integer.parseInt(num[0]) > Integer.parseInt(num[1])) {
			System.out.print(num[0]);
		} else {
			System.out.print(num[1]);
		}
		
		
	/*
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
		
		System.out.print(A>B?A:B);
	 */
		
	}
}
