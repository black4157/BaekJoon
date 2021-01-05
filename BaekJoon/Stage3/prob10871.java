import java.util.*;

public class prob10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int m = scan.nextInt();
			
			if(m < x) {
				System.out.print(m + " ");
			}
		}
	}
}
