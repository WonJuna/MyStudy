import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study120 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int[][] map = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = Integer.MAX_VALUE;
			}
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			map[a][b] = Math.min(map[a][b], c);
			
		}
		
		for(int k=1; k<=n; k++) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					
					if(i==j) {
						continue;
					}
					if(map[i][k]==Integer.MAX_VALUE || map[k][j]==Integer.MAX_VALUE) {
						continue;
					}
					
					map[i][j] = Math.min(map[i][j], map[i][k]+map[k][j]);
					
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(map[i][j]==Integer.MAX_VALUE) {
					System.out.print(0 + " ");
				} else {
					System.out.print(map[i][j] + " ");
				}
			}
			System.out.println();
		}
		
	}

}
