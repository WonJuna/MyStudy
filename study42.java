import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class study42 {
	
	public static int n, m;
	public static int[][] arr, visit;
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, -1, 0, 1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visit = new int[n][m];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		int totalcount = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==1 && visit[i][j]==0) {
					totalcount++;
					int count = DFS(i, j, totalcount, 0);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(totalcount);
		
		if(totalcount==0) {
			System.out.println(0);
		} else {
			System.out.println(list.get(list.size()-1));
		}
		
	}
	
	public static int DFS(int i, int j, int totalcount, int count) {
		count++;
		visit[i][j] = 1;
		
		for(int k=0; k<4; k++) {
			int newi = i + dx[k];
			int newj = j + dy[k];
			
			if(newi>=0 && newi<n && newj >=0 && newj<m) {
				if(arr[newi][newj]==1 && visit[newi][newj]==0) {
					count = DFS(newi, newj, totalcount, count);
				}
			}
		}
		
		return count;
		
	}

}
