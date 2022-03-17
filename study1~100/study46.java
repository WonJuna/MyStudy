import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study46 {
	
	static int n,m,k;
	static int[][] arr, visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new int[n][m];
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x-1][y-1] = 1;
		}
		
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1 && visit[i][j]==0) {
					int count = DFS(i, j, 0);
					max = Math.max(max, count);
				}
			}
		}
		
		System.out.println(max);
	}
	
	public static int DFS(int i, int j, int count) {
		count++;
		visit[i][j] = 1;
		
		for(int f=0; f<4; f++) {
			int newi = i + dy[f];
			int newj = j + dx[f];
			
			if(newi>=0 && newi<n && newj>=0 && newj<m) {
				if(arr[newi][newj]==1 && visit[newi][newj]==0) {
					count = DFS(newi, newj, count);
				}
			}
		}
		
		return count;
	}

}
