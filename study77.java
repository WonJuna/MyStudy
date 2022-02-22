import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study77 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[2][n];
			
			for(int j=0; j<2; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				for(int k=0; k<n; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			if(n!=1) {
				arr[0][1] = arr[1][0] + arr[0][1];
				arr[1][1] = arr[0][0] + arr[1][1];
			}
			
			for(int j=2; j<n; j++) {
				arr[0][j] = Math.max(arr[1][j-2], arr[1][j-1]) + arr[0][j];
				arr[1][j] = Math.max(arr[0][j-2], arr[0][j-1]) + arr[1][j];
			}
			
			sb.append(Math.max(arr[0][n-1], arr[1][n-1]) + "\n");
			
		}
		
		System.out.println(sb);
	}

}
