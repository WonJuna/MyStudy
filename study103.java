import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study103 {
	
	static class Place {
		int x;
		int y;
		int dis;
		int drill;
		
		public Place(int x, int y, int dis, int drill) {
			this.x = x;
			this.y = y;
			this.dis = dis;
			this.drill = drill;
		}
	} 
	
	static int ans, n, m;
	static int[][] arr, visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split("");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
				visit[i][j] = Integer.MAX_VALUE;
			}
		}
		
		ans = Integer.MAX_VALUE;
		
		bfs(0, 0);
		
		if(ans==Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
		
	}
	
	public static void bfs(int x, int y) {
		
		Queue<Place> q = new LinkedList<>();
		q.add(new Place(x, y, 1, 0));
		visit[x][y] = 0;
		
		while(!q.isEmpty()) {
			Place p = q.poll();
			
			if(p.x==n-1 && p.y==m-1) {
				ans = p.dis;
				break;
			}
			
			for(int i=0; i<4; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m) {
					if(visit[nx][ny]>p.drill) {
						if(arr[nx][ny]==0) {
							visit[nx][ny] = p.drill;
							q.add(new Place(nx, ny, p.dis+1, p.drill));
						} else {
							if(p.drill==0) {
								visit[nx][ny] = p.drill + 1;
								q.add(new Place(nx, ny, p.dis+1, p.drill + 1));
							}
						}
					}
				}
			}
		}
		
		
	}

}
