import java.util.PriorityQueue;
import java.util.Scanner;

public class study135 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		int answer = 0;
		if(n==1) {
			System.out.println(0);
		} else {
			for(int i=0; i<n; i++) {
				queue.add(sc.nextInt());
			}
			
			while(true) {
				if(queue.size()==1) {
					break;
				}
				
				int a = queue.poll() + queue.poll();
				
				answer += a;
				
				queue.add(a);
			}
			
			System.out.println(answer);
			
		}
		
		
	}

}
