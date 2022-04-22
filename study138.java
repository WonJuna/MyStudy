import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class study138 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		
		Stack<String> stack = new Stack<>();
		
		int answer = 0;
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals("(")) {
				stack.push("(");
				continue;
			}
			
			if(str[i].equals(")")) {
				stack.pop();
				
				if(str[i-1].equals("(")) {
					answer += stack.size();
				} else {
					answer++;
				}
			}
			
		}
		
		
		System.out.println(answer);
		
	}
	
}
