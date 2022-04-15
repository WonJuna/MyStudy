import java.util.PriorityQueue;
import java.util.Scanner;

public class study130 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if(abs1==abs2) return o1>o2?1:-1;
			else return abs1 - abs2;
		}); 
		
		for(int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			
			if(a==0) {
				if(queue.size()==0) {
					sb.append(0+ "\n");
				} else {
					sb.append(queue.poll()+ "\n");
				}
			} else {
				queue.add(a);
			}
		}
		
		System.out.println(sb);
		
	}

}
