import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

//public class prob3052 {
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashSet<Integer> hash = new HashSet<Integer>();
//		
//		for(int i = 0; i<10; i++) {
//			hash.add(Integer.parseInt(br.readLine()) % 42);
//		}
//		
//		System.out.print(hash.size());
//	}
//}

public class prob3052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[10];
		int count = 0;
		
		for(int i = 0; i<10; i++) {
			array[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for(int i = 0; i<10; i++) {
			int check = 0;
			
			for(int j = i+1; j<10; j++) {
				if(array[i] == array[j]) {
					check++;
				}
			}
			
			if(check == 0) {
				count++;
			}
		}
		
		System.out.print(count);
	}
}

