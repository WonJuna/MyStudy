import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class study63 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] indegree = new int[n+1];
		List<Integer>[] list = new ArrayList[n+1];
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			indegree[b]++;
		}
		
		for(int i=1; i<=n; i++) {
			if(indegree[i]==0) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current + " ");
			
			for(int i=0; i<list[current].size(); i++) {
				int next = list[current].get(i);
				
				indegree[next]--;
				if(indegree[next]==0) {
					queue.add(next);
				}
			}
			
		}
		
	}
  
}
