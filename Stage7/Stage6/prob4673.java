public class prob4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < 10001; i++) {
			int num = selfNum(i);
			
			if(num < 10001) {
				check[num] = true;
			}
		}
		
		for (int i = 1; i < 10001; i++) {
			if(!check[i]){
				System.out.println(i);
			}
		}
		
	}
	
	public static int selfNum(int n) {
		int nextNum = n;
		while(n > 0) {
			nextNum += n % 10;
			n /= 10;
		}
		
		return nextNum;
	}
}
