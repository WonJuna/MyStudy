import java.util.Scanner;

public class study89 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] w = new int[n+1];
		int[] dp = new int [n+1];
		
		for(int i=1; i<=n; i++) {
			w[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = w[1];
		
		if(n>1) {
			dp[2] = w[1] + w[2];
		}
		
		for(int i=3; i<=n ; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+w[i]);
			dp[i] = Math.max(dp[i], dp[i-3]+w[i-1]+w[i]);
		}
		
		System.out.println(dp[n]);
		
	}

}
