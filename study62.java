import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study62 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n+2][n+2];
		int[] dp = new int[n+2];
		
		StringTokenizer st;
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=n; i>0; i--) {
			int nowtime = i + arr[i][0];
			if(nowtime > n+1) {
				dp[i] = dp[i+1];
			} else {
				dp[i] = Math.max(dp[i+1], arr[i][1]+dp[nowtime]);
			}
		}
		
				
		System.out.println(dp[1]);
	}

}
