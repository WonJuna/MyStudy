import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class study123 {
	
	static class Spot implements Comparable<Spot> {
		int x;
		int y;
		int cost;
		
		public Spot(int x, int y, int cost) {
			this.x = x;
			this.y = y;
			this.cost = cost;
		}
		
		@Override
		public int compareTo(Spot o) {
			return this.cost < o.cost ? -1 : 1;
		}
	}
	
	static PriorityQueue<Spot> queue;
	static int[][] dis, map;
	static int result=0, n , m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[m+1][n+1];
		dis = new int[m+1][n+1];
		
		for(int i=1; i<=m; i++) {
			String[] str = br.readLine().split("");
			for(int j=1; j<=n; j++) {
				map[i][j] = Integer.parseInt(str[j-1]);
				dis[i][j] = Integer.MAX_VALUE;
			}
		}
		
		queue = new PriorityQueue<>();
		
		bfs();
		
		System.out.println(result);
		
	}
	
	public static void bfs() {
		queue.add(new Spot(1,1,0));
		dis[1][1] = 0;
		
		while(!queue.isEmpty()) {
			
			Spot s = queue.poll();
			
			if(s.x==m && s.y==n) {
				result = s.cost;
				return;
			}
			
			for(int i=0; i<4; i++) {
				int nx = s.x + dx[i];
				int ny = s.y + dy[i];
				
				if(nx>0 && nx<=m && ny>0 && ny<=n) {
					if(dis[nx][ny]>dis[s.x][s.y]+map[nx][ny]) {
						dis[nx][ny] = dis[s.x][s.y]+map[nx][ny];
						queue.add(new Spot(nx,ny,dis[nx][ny]));
					}
				}
			}
			
		}
		
	}

}
