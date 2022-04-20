import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class study136 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			
			String[] str = br.readLine().split(" ");
			
			if(str[0].equals("push_front")) {
				dq.addFirst(Integer.parseInt(str[1]));
			}
			else if(str[0].equals("push_back")) {
				dq.addLast(Integer.parseInt(str[1]));
			}
			else if(str[0].equals("pop_front")) {
				if(dq.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.pollFirst() + "\n");
				}
			}
			else if(str[0].equals("pop_back")) {
				if(dq.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.pollLast() + "\n");
				}
			}
			else if(str[0].equals("size")) {
				sb.append(dq.size() + "\n");
			}
			else if(str[0].equals("empty")) {
				if(dq.size()==0) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			}
			else if(str[0].equals("front")) {
				if(dq.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.peekFirst() + "\n");
				}
			}
			else if(str[0].equals("back")) {
				if(dq.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(dq.peekLast() + "\n");
				}
			}
		}
		
		System.out.println(sb);
		
	}

}
