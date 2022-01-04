import java.util.*;
import java.io.*;

public class study23 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+1][n+1];
		
		int max=0;
		
		for(int i=1; i<=n; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=1; j<=i; j++) {
				
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				if(j==1) {
					arr[i][j] = arr[i-1][j] + arr[i][j];
				} else if(j==i) {
					arr[i][j] = arr[i-1][j-1] + arr[i][j];
				} else {
					arr[i][j] = Math.max(arr[i-1][j], arr[i-1][j-1]) + arr[i][j];
				}
				
				max = Math.max(max, arr[i][j]);
			}
			
		}
		
		System.out.println(max);
		
	}

}
