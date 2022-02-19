import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study75 {
	static int n;
	static int[][] arr, sum;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		while(true) {
			
			count++;
			n = Integer.parseInt(br.readLine());
			
			if(n==0) {
				break;
			}
			
			arr = new int[n][n];
			sum = new int[n][n];
			
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for(int j=0; j<n; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					sum[i][j] = 10000000;
				}
			}
			
			bfs(0, 0);
			
			sb.append("Problem " + count + ": " + sum[n-1][n-1] + "\n");
			
		}
		
		System.out.println(sb);
		
	}
	
	public static void bfs(int i, int j) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] {i,j});
		sum[i][j] = arr[i][j];
		
		while(!q.isEmpty()) {
			
			int[] a = q.poll();
			int x = a[0];
			int y = a[1];
			
			for(int k=0; k<4; k++) {
				int newx = x + dx[k];
				int newy = y + dy[k];
				
				if(newx>=0 && newx<n && newy>=0 && newy<n) {
					if(sum[x][y]+arr[newx][newy]<sum[newx][newy]) {
						sum[newx][newy] = sum[x][y]+arr[newx][newy];
						q.offer(new int[] {newx, newy});
					}
				}
				
			}
			
		}
		
		
	}

}
