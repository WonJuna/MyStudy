import java.util.Scanner;

public class study112 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] f = new int[n+2];
		int[] dp = new int[n+2];
		
		for(int i=1; i<=n; i++) {
			f[i] = sc.nextInt();
		}
		
		dp[1] = f[1];
		dp[2] = f[1] + f[2];
		
		for(int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-3]+f[i-1]+f[i], dp[i-2]+f[i]);
		}
		
		System.out.println(dp[n]);
	}

}
