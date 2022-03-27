import java.util.Scanner;
import java.util.Stack;

public class study111 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals(".")) {
				break;
			}
			
			sb.append(solve(s) + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static String solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c=='(' || c=='[') {
				stack.push(c);
			} 
			else if(c==')') {
				if(stack.empty() || stack.peek()!='(') {
					return "no";
				} else {
					stack.pop();
				}
			}
			else  if(c==']') {
				if(stack.empty() || stack.peek()!='[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		
		if(stack.empty()) {
			return "yes";
		} else {
			return "no";
		}
		
	}

}
