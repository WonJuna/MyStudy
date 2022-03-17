import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study45 {
	
	static int m,n,h,max;
	static int[][][] arr;
	static Queue<int[]> queue;
	static int[] dz = {1,-1,0,0,0,0};
	static int[] dx = {0,0,0,0,-1,1};
	static int[] dy = {0,0,-1,1,0,0};
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		arr = new int[h][n][m];
		queue = new LinkedList<>();
		
		for(int f=0; f<h; f++) {
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine(), " ");
			
				for(int j=0; j<m; j++) {
					arr[f][i][j] = Integer.parseInt(st.nextToken());
					if(arr[f][i][j]==1) {
						queue.offer(new int[] {f, i, j});
					}
				}
			}
		}
		
		BFS();
	

	}
	
	public static void BFS() {
		while(!queue.isEmpty()) {
			
			int[] tmp = queue.poll();
			int f = tmp[0];
			int i = tmp[1];
			int j = tmp[2];
			
			for(int k=0; k<6; k++) {
				int nf = tmp[0] + dz[k];
				int ni = tmp[1] + dx[k];
				int nj = tmp[2] + dy[k];
				
				if(nf>=0 && nf<h && ni>=0 && ni<n && nj>=0 && nj<m) {
					if(arr[nf][ni][nj]==0) {
						arr[nf][ni][nj] = arr[f][i][j] + 1;
						queue.offer(new int[] {nf, ni, nj});
					}
				}
			}
		}
		
		for(int f=0; f<h; f++) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					if(arr[f][i][j]==0) {
						System.out.println(-1);
						return;
					}
					max = Math.max(max, arr[f][i][j]);
				}
			}
		}
		
		System.out.println(max-1);
		
	}

}
