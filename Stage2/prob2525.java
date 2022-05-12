import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob2525 {
	public void solution() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		try {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour = Integer.parseInt(st.nextToken());
			int minute = Integer.parseInt(st.nextToken());
			
			int time = Integer.parseInt(br.readLine());
			
			if (minute + time >= 60) {
				hour += (minute + time) / 60;
				minute = (minute + time) % 60;
				
				if(hour >= 24) {
					hour -= 24;
				}
			} else {
				minute += time;
			}
			
			System.out.println(sb.append(hour).append(" ").append(minute));
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		prob2525 prob = new prob2525();
		prob.solution();
	}
}
