import java.io.BufferedReader;
import java.io.InputStreamReader;

public class prob17478 {
	static String s1 = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n";
	static String s2 = "\"재귀함수가 뭔가요?\"\n";
	static String s3 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
	static String s4 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
	static String s5 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";
	static String s6 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
	static String s7 = "라고 답변하였지.\n";
	
	static StringBuilder sb;
	
	static int depthIn = 0;
	static int depthOut = 0;
	
	public StringBuilder repeat(int n) {
		if(depthIn > 0) {
			s2 = "____" + s2;
			s3 = "____" + s3;
			s4 = "____" + s4;
			s5 = "____" + s5;
			s6 = "____" + s6;
			s7 = "____" + s7;
		}
		
		if(n > 0) {
			sb.append(s2 + s3 + s4 + s5);
			depthIn++;
			repeat(n-1);
		} else {
			sb.append(s2 + s6);
			depthOut++;
			return sb.append(s7);
		}
		
		if (depthOut > 0) { 
			s7 = s7.substring(4);
		}
		
		return sb.append(s7);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sb = new StringBuilder(s1);
		prob17478 prob = new prob17478();
		System.out.println(prob.repeat(n));
	}
}
