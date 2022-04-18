import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class study133 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<n*n; i++) {
			q.add(sc.nextInt());
		}
		
		for(int i=0; i<n-1; i++) {
			q.poll();
		}
		
		System.out.println(q.poll());
		
	}

}
