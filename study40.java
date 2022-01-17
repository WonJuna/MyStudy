import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class study40 {
	public static int n;
	public static int[][] arr;
	public static int[][] visit;
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, -1, 0, 1};
 	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		visit = new int[n][n];
		
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<n; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		int totalCount = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(arr[i][j]==1 && visit[i][j]==0) {
					totalCount++;
					int count = DFS(i, j, totalCount, 0);
					list.add(count);
				}
				
			}
		}
		
		Collections.sort(list);
		
		System.out.println(totalCount);
		
		for(int l : list) {
			System.out.println(l);
		}
		
	}
	
	public static int DFS(int i, int j, int totalCount, int count) {
		count++;
		visit[i][j] = 1;
		
		for(int k=0; k<4; k++) {
			int newi = i + dx[k];
			int newj = j + dy[k];
			
			if(newi >= 0 && newi < n && newj >=0 && newj < n) {
				if(arr[newi][newj]==1 && visit[newi][newj]==0) {
					count = DFS(newi, newj, totalCount, count);
				}
			}
		}
		
		return count;
		
	}

}
