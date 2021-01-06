import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob8958 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int score=0;
		int count;
		int n = Integer.parseInt(br.readLine());
		String OX;
		String[] array_OX;
		
		for(int i = 0; i < n; i++) {
			OX = br.readLine();
			array_OX = OX.split("");
			count = 1;
			
			for(int j = 0; j<array_OX.length; j++) {
				if(array_OX[j].equals("O")) {
					score = score + count;
					count++;
				} else {
					count = 1;
				}
			}
			System.out.println(score);
			score = 0;
		}
	}
}
