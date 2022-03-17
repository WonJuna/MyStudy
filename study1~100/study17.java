import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class study17 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> q = new ArrayDeque<Integer>();
		
		String[] st = null;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n ; i++) {
			st = br.readLine().split(" ");
			
			if(st[0].equals("push")) {
				q.add(Integer.parseInt(st[1]));
			}
			else if(st[0].equals("pop")) {
				if(q.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.removeFirst() + "\n");
				}
			}
			else if(st[0].equals("size")) {
				sb.append(q.size() + "\n");
			}
			else if(st[0].equals("empty")) {
				if(q.isEmpty()==true) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			}
			else if(st[0].equals("front")) {
				if(q.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.getFirst() + "\n");
				}
			}
			else if(st[0].equals("back")) {
				if(q.size()==0) {
					sb.append(-1 + "\n");
				} else {
					sb.append(q.getLast() + "\n");
				}
			}
		}
		
		System.out.println(sb);
		
	}

}
