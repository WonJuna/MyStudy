import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class study20 {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			
			int x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				if(q.isEmpty()) {
					sb.append(0 + "\n");
				} else {
					sb.append(q.poll() + "\n");
				}
			}
			
			q.offer(x);
			
		}
		
		System.out.println(sb);
	}
}
