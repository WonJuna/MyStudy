import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class study147 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Deque<Integer> d = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			d.add(i);
		}
		
		while(true) {
			
			if(d.size()==1) {
				System.out.print(d.poll());
				break;
			}
			
			System.out.print(d.pollFirst() + " ");
			
			d.addLast(d.pollFirst());
			
		}
		
	}

}
