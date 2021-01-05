import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 规过1
/*import java.util.Scanner;

public class prob2562 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[9];
		int max = a[0];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int b = scan.nextInt();
			a[i] = b;

			if (max < b) {
				max = b;
				count = i + 1;
			}
		}
		System.out.print(max + "\n" + count);
	}
}
*/

//规过2
public class prob2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[9];

		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int max = a[0];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				count = i + 1;
			}
		}

		System.out.print(max + "\n" + count);
	}
}