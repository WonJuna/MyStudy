import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class study90 {
	static int m,n;
	static int[][] arr, visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new int[n][m];
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<k; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int j=x1; j<x2; j++) {
				for(int p=y1; p<y2; p++) {
					arr[j][p] = 1;
				}
			}
		}
		
		int totalcount = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==0 && visit[i][j]==0) {
					totalcount++;
					int count = dfs(i,j,0);
					list.add(count);
				}
				
			}
		}
		
		System.out.println(totalcount);
		Collections.sort(list);
		for(int a : list) {
			System.out.print(a + " ");
		}
		
	}
	
	public static int dfs(int i, int j, int count) {
		count++;
		visit[i][j] = 1;
		
		for(int p=0; p<4; p++) {
			int newi = i + dx[p];
			int newj = j + dy[p];
			
			if(newi>=0 && newi<n && newj>=0 && newj<m) {
				if(arr[newi][newj]==0 && visit[newi][newj]==0) {
					count = dfs(newi, newj, count);
				}
			}
		}
		
		return count;
		
	}
	

}
