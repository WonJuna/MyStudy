import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class study59 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			
			int x = Integer.parseInt(br.readLine());
			
			if(x==0) {
				if(pq.size()==0) {
					sb.append(0 + "\n");
				} else {
					sb.append(pq.poll() + "\n");
				}
			} else {
				pq.add(x);
			}
		}
		
		System.out.println(sb);
		
	}

}
