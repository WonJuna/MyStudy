import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class study106 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int s = sc.nextInt();
		int g = sc.nextInt();
		int u = sc.nextInt();
		int d = sc.nextInt();
		
		int[] visit = new int[f+1];
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{s,0});
		visit[s] = 1;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			
			if(now[0]==g) {
				System.out.println(now[1]);
				return;
			}
			
			int up = now[0] + u;
			int down = now[0] - d;
			
			if(up>=1 && up<=f && visit[up]==0) {
				visit[up] = 1;
				q.add(new int[] {up, now[1]+1});
			}
			if(down>=1 && down<=f && visit[down]==0) {
				visit[down] = 1;
				q.add(new int[] {down, now[1]+1});
			}
			
		}
		
		System.out.println("use the stairs");
		
	}

}
