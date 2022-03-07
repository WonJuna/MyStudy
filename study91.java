import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study91 {
	
	static int r,c;
	static int wolf = 0, sheep = 0;
	static char[][] arr;
	static int[][] visit;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		arr = new char[r][c];
		visit = new int[r][c];
		
		for(int i=0; i<r; i++) {
			String str = br.readLine();
			for(int j=0; j<c; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		int totalwolf = 0;
		int totalsheep = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if((arr[i][j]=='v' || arr[i][j]=='o') && visit[i][j]==0) {
					sheep = wolf = 0;
					dfs(i, j);
					if(sheep>wolf) {
						totalsheep += sheep;
					} else {
						totalwolf += wolf;
					}
				}
			}
		}
		
		System.out.print(totalsheep + " " + totalwolf);
		
	}
	
	public static void dfs(int i, int j) {
		visit[i][j] = 1;
		if(arr[i][j]=='v') {
			wolf++;
		}
		if(arr[i][j]=='o') {
			sheep++;
		}
		
		for(int k=0; k<4; k++) {
			int newi = i + dx[k];
			int newj = j + dy[k];
			
			if(newi>=0 && newi<r && newj>=0 && newj<c && arr[newi][newj]!='#' && visit[newi][newj]==0) {
				dfs(newi, newj);
			}
		}
	}

}
