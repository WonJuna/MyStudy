import java.util.Scanner;

public class study140 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<3; j++) {
				arr[i+1][j] += Math.min(arr[i][(j+1)%3], arr[i][(j+2)%3]);
			}
		}
		
		int result = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			result = Math.min(result, arr[n-1][i]);
		}
		
		System.out.println(result);
	}

}
