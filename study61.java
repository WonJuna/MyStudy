import java.util.Scanner;

public class study61 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] result = new int[n+1];
		int[][] dp = new int[n+1][10];
		
		for(int i=0; i<10; i++) {
			dp[1][i] = 1;
		}
		result[1] = 10;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][j];
				} else {
					dp[i][j] = dp[i-1][j] + dp[i][j-1];
					dp[i][j] %= 10007;
				}
				result[i] += dp[i][j];
			}
		}
		
		System.out.println(result[n] % 10007);
	}

}
