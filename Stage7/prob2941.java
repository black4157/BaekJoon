import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob2941 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'c' && i < s.length()-1) {
				if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') i += 1;
			} 
			
			else if(s.charAt(i) == 'd' && i < s.length()-1) {
				if(s.charAt(i+1) == 'z' && i < s.length()-2) {
					if(s.charAt(i+2) == '=') i += 2;
				} else if(s.charAt(i+1) == '-') i += 1;
			}
			
			else if(s.charAt(i) == 'l' && i < s.length()-1) {
				if(s.charAt(i+1) == 'j') i += 1;
			} 
			
			else if(s.charAt(i) == 'n' && i < s.length()-1) {
				if(s.charAt(i+1) == 'j') i += 1;
			} 
			
			else if(s.charAt(i) == 's' && i < s.length()-1) {
				if(s.charAt(i+1) == '=') i += 1;
			} 
			
			else if(s.charAt(i) == 'z' && i < s.length()-1) {
				if(s.charAt(i+1) == '=') i += 1;
			} 
			
		
			count++;
			
		}
		
		System.out.print(count);
	}
}
