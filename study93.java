import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class study93 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			case "push": 
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(stack.isEmpty()) {
					sb.append("-1" + "\n");
					break;
				} else {
					sb.append(stack.pop() + "\n");
					break;
				}
			case "size":
				sb.append(stack.size() + "\n");
				break;
			case "empty":
				if(stack.isEmpty()) {
					sb.append("1" + "\n");
					break;
				} else {
					sb.append("0" + "\n");
					break;
				}
			case "top":
				if(stack.isEmpty()) {
					sb.append("-1" + "\n");
					break;
				} else {
					sb.append(stack.peek() + "\n");
					break;
				}
				
			}
		}
		
		System.out.println(sb);
			
	}
		
}


