import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study64 {
	
	static int m, n;
	static int[][] arr, visit;
	static int[] dx = {-1,0,1,0,-1,-1,1,1};
	static int[] dy = {0,-1,0,1,-1,1,-1,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new int[m][n];
		visit = new int[m][n];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int totalcount = 0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && visit[i][j]==0) {
					totalcount++;
					dfs(i, j);
				}
			}
		}
		
		System.out.println(totalcount);
		
	}
	
	public static void dfs(int i, int j) {
		visit[i][j] = 1;
		
		for(int k=0; k<8; k++) {
			int newi = i + dx[k];
			int newj = j + dy[k];
			
			if(newi>=0 && newi<m && newj>=0 && newj<n) {
				if(arr[newi][newj]==1 && visit[newi][newj]==0) {
					dfs(newi, newj);
				}
			}
		}
	}

}
