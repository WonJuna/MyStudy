import java.util.Scanner;

public class study96 {
	
	static int n;
	static int[][] arr, copyarr, visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int totalmax = -1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr = new int[n][n];
		visit = new int[n][n];
		
		int max = -1;
		int min = 101;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
				
				max = Math.max(max, arr[i][j]);
				min = Math.min(min, arr[i][j]);
			}
		}
		
		for(int i=min-1; i<=max; i++) {
			color(i);
		}
		
		System.out.println(totalmax);
		
	}
	
	public static void color(int i) {
		
		for(int j=0; j<n; j++) {
			for(int k=0; k<n; k++) {
				visit[j][k] = 0;
				
				if(arr[j][k]<=i) {
					arr[j][k] = -1;
				}
			}
		}
		
		int totalcount = 0;
		for(int j=0; j<n; j++) {
			for(int k=0; k<n; k++) {
				if(arr[j][k]!=-1 && visit[j][k]==0) {
					totalcount++;
					dfs(j, k);
				}
			}
		}
		
		totalmax = Math.max(totalmax, totalcount);
	}
	
	public static void dfs(int j, int k) {
		visit[j][k] = 1;
		
		for(int i=0; i<4; i++) {
			int newj = j + dx[i];
			int newk = k + dy[i];
			
			if(newj>=0 && newj<n && newk>=0 && newk<n) {
				if(arr[newj][newk]!=-1 && visit[newj][newk]==0) {
					dfs(newj, newk);
				}
			}
		}
	}
}
