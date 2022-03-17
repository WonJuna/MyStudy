import java.util.Scanner;
import java.util.Stack;

public class study57 {
	
	public static void main(String[] args) {
	
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<s.length(); i++) {
			
			int count = 0;
					
			if(s.charAt(i)=='<') {
				for(int j=i; j<s.length(); j++) {
					sb.append(s.charAt(j));
					count++;
					if(s.charAt(j)=='>') {
						i += count-1;
						break;
					}
				}
			} else if(s.charAt(i)==' ') {
				sb.append(' ');
			} else {
				for(int j=i; j<s.length(); j++) {
					if(s.charAt(j)==' ' || s.charAt(j)=='<') {
						i += count - 1;
						break;
					} else {
						stack.push(String.valueOf(s.charAt(j)));
						count++;
						if(j==s.length()-1) {
							i += count -1;
							break;
						}
					}
				}
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
			}
			
		}
		
		System.out.println(sb);
		
	}

}
