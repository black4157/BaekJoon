import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1316 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		int groupNum = 0;
		
		for(int i = 0; i < n ; i++) {
			String s = br.readLine().toLowerCase();

			for(int index = 0; index < s.length(); index ++) {
				for(int j = index + 2; j < s.length(); j++) {
					if(s.charAt(index) == s.charAt(j) && s.charAt(j) != s.charAt(j-1)) groupNum++;
				}

			}
			
			if(groupNum == 0) {
				count++; 
			}
			groupNum = 0;
		}
		
		System.out.print(count);
	}
}
