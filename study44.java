import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study44 {
	
	static int size;
	static int[][] visit;
	static int[] dx = {-1,-2,-2,-1,1,2,2,1};
	static int[] dy = {-2,-1,1,2,2,1,-1,-2};
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		sb = new StringBuilder();
		
		for(int i=0; i<c; i++) {
			
			size = Integer.parseInt(br.readLine());
			
			visit = new int[size][size];
			
			int[] f = new int[2];
			int[] d = new int[2];
			
			st = new StringTokenizer(br.readLine(), " ");
			f[0] = Integer.parseInt(st.nextToken());
			f[1] = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			d[0] = Integer.parseInt(st.nextToken());
			d[1] = Integer.parseInt(st.nextToken());
			 
			BFS(f[0], f[1], d[0], d[1]);
		}
		
		System.out.println(sb);
		
	}
	
	public static void BFS(int fi, int fj, int di, int dj) {
		
		visit[fi][fj] = 1;
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {fi, fj, 0});
		
		while(!queue.isEmpty()) {
			
			int[] tmp = queue.poll();
			
			if(tmp[0]==di && tmp[1]==dj) {
				sb.append(tmp[2] + "\n");
				return;
			}
			
			for(int i=0; i<8; i++) {
				int newi = tmp[0] + dx[i];
				int newj = tmp[1] + dy[i];
				int count = tmp[2];
				
				if(newi>=0 && newi<size && newj>=0 && newj<size) {
					if(visit[newi][newj]==0) {
						visit[newi][newj]=1;
						queue.offer(new int[] {newi, newj, count+1});
					}
				}
			}
			
		}
		
	}

}
