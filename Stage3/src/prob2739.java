import java.util.*;

public class prob2739 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i = 1; i<=9; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
}
