import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob1193 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		//i = �밢���� ���� ����, j = ���� �밢���� ������ ��
		int i = 1, j = 0;
		
		while (true) {
			if(x <= i + j) {
				
				//i�� Ȧ���� �� ==> ¦����
				if(i % 2 == 1) {
					System.out.print((i- (x-j-1)) + "/" + (x-j));
					break;
				} 
				
				//i�� ¦���� �� ==> Ȧ����
				else {
					System.out.print((x-j) + "/" + (i- (x-j-1)));
					break;
				}
			} else {
				j += i;
				i++;
			}
		}
	}
}
