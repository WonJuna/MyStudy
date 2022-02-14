import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class study70 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(arr[i][j]!=1) {
					arr[i][j] = 9;
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					if(k!=j) {
						if(arr[k][j] > arr[k][i]+arr[i][j]) {
							arr[k][j] = arr[k][i]+arr[i][j];
						}
					}
				}
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1; i<=n; i++) {
			int tmp = 0;
			for(int j=1; j<=n; j++) {
				if(arr[i][j]!=9) {
					tmp += arr[i][j];
				}
			}
			list.add(tmp);
		}
		
		int min = Collections.min(list);
		for(int i=0; i<list.size(); i++) {
			if(min == list.get(i)) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
