import java.util.*;

public class prob10871 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		int n = scan.nextInt();
		int x = scan.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i=0; i<n; i++) {
			int m = scan.nextInt();
			a[i] = m;
			
			if(m < x) {
				b[count] = m;
				count++;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
