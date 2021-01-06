import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1157 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String[] s = br.readLine().toLowerCase().split("");
		String[] arrAlpa = alpa.split("");
		int[] arrNum = new int[26];
		
		for(int i = 0; i < s.length; i++) {
			for(int j = 0; j < arrAlpa.length; j++) {
				if(s[i].equals(arrAlpa[j])) {
					arrNum[j] += 1;
				}
			}
		}
		int index = 0;
		int max = 0;
		int max1 = 0;
		
		for(int i = 0; i < arrNum.length; i++) {
			if(max < arrNum[i]) {
				max = arrNum[i];
				index = i;
			} else if(max == arrNum[i]) {
				max1 = max;
				max = arrNum[i];
				index = i;
			}
		}

		if(max == max1) System.out.print("?");
		else System.out.print(arrAlpa[index].toUpperCase());
		
	}
}
