import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prob15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i = 0; i < a.length; i++) {
			ans += a[i];
		}
        return ans;
    }
}

/* test

public class prob15596 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(sum(array));
	}
	
	public static long sum(int[] a) {
		int add=0;
		for(int i = 0; i < a.length; i++) {
			add += a[i];
		}
		return add;
	}
}

*/