import java.util.Scanner;

public class study114 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				arr[i][j] = sc.nextInt();
				
				int max = Math.max(arr[i-1][j], Math.max(arr[i][j-1], arr[i-1][j-1]));
				arr[i][j] += max;
			}
		}
		
		System.out.println(arr[n][m]);
	}
}
