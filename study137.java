import java.util.PriorityQueue;
import java.util.Scanner;

public class study137 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		PriorityQueue<Long> pq = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			pq.add(sc.nextLong());
		}
		
		for(int i=0; i<m; i++) {
			long a = pq.poll() + pq.poll();
			
			pq.add(a);
			pq.add(a);
		}
		
		long answer = 0;
		for(int i=0; i<n; i++) {
			answer += pq.poll();
		}
		
		System.out.println(answer);
		
	}

}
