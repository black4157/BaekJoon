import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class prob25192 {
	
	public int solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> strSet;
		int count = 0;
		try {
			int input = Integer.parseInt(br.readLine());
			strSet = new HashSet<>(input);
			
			for(int i = 0; i < input; i++) {
				String str = br.readLine();
				
				if ("ENTER".equals(str)) {
					strSet = new HashSet<>(input);
					continue;
				} else {
					if (strSet.contains(str)) {
						continue;
					} else {
						strSet.add(str);
					}
				}
				count++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		prob25192 prob = new prob25192();
		System.out.println(prob.solution());
	}
}
