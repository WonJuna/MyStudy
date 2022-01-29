import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study53 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		int[] bridge = new int[w];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<n; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		bridge[0] = queue.poll();
		
		int count = 1;
		int sum = 1001;
		while(true) {
		
			if(sum==0) {
				break;
			}
			
			count++;
			
			for(int i=w-1; i>0; i--) {
				bridge[i] = bridge[i-1];
			}
			
			sum = 0;
			for(int i : bridge) {
				sum += i;
			}
			
			if(queue.isEmpty()) {
				sum -= bridge[0];
				bridge[0] = 0;
				continue;
			}
			
			if(sum - bridge[0] + queue.peek() <= L) {
				bridge[0] = queue.poll();
			} else {	
				bridge[0] = 0;
			}
			
			for(int i : bridge) {
				sum += i;
			}
			
		}
		
		System.out.println(count);
	}

}
