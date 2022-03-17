import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study41 {
	
	public static int w, h;
	public static int[][] arr, visit;
	public static int[] dx = {-1,0,1,0,-1,-1,1,1};
	public static int[] dy = {0,-1,0,1,-1,1,-1,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if(w==0 && h==0) {
				break;
			}
			
			arr = new int[h][w];
			visit = new int[h][w];
			
			for(int i=0; i<h; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				for(int j=0; j<w; j++) {
					arr[i][j] = Integer.parseInt(st2.nextToken());
				}
			}
			
			int count = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(arr[i][j]==1 && visit[i][j]==0) {
						count++;
						DFS(i, j, count);
					}
				}
			}
			
			sb.append(count + "\n");
			
		}
		
		System.out.println(sb);
	}
	
	public static void DFS(int i, int j, int count) {
		visit[i][j] = 1;
		
		for(int k=0; k<8; k++) {
			int newi = i + dx[k];
			int newj = j + dy[k];
			
			if(newi>=0 && newi<h && newj>=0 && newj<w) {
				if(arr[newi][newj]==1 && visit[newi][newj]==0) {
					DFS(newi, newj, count);
				}
			}
		}
	}

}
