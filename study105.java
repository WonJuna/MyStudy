import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study105 {
	
	static class Point {
		int x;
		int y;
		int dis;
		
		Point(int x, int y, int dis) {
			this.x = x;
			this.y = y;
			this.dis = dis;
		}
	}
	static int n, m;
	static int[][] visit;
	static char[][] arr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int distance;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		visit = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int count = -1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]=='L') {
					count = Math.max(bfs(i, j), count);
				}
			}
		}
		
		System.out.println(count);
		
	}
	
	public static int bfs(int i, int j) {
		visit = new int[n][m];
		visit[i][j] = 1;
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(i, j, 0));
		
		while(!q.isEmpty()) {
			Point p = q.poll();
			distance = p.dis;
			
			for(int k=0; k<4; k++) {
				int newi = p.x + dx[k];
				int newj = p.y + dy[k];
				
				if(newi>=0 && newi<n && newj>=0 && newj<m) {
					if(visit[newi][newj]==0 && arr[newi][newj]=='L') {
						visit[newi][newj] = 1;
						q.add(new Point(newi, newj, p.dis+1));
					}
				}
			}
			
		}
		
		return distance;
	}

}
