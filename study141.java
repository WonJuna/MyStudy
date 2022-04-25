import java.util.Scanner;

public class study141 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[2][n];
		
		for(int i=0; i<n; i++) {
			arr[0][i] =sc.nextInt();
		}
		
		int result = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			arr[1][i] = 1;
			
			for(int j=0; j<i; j++) {
				if(arr[0][i]>arr[0][j] && (arr[1][j]+1)>arr[1][i]) {
					arr[1][i] = arr[1][j] + 1;
				}
			}
			result = Math.max(result, arr[1][i]);
		}
		
		System.out.println(result);
		
	}

}
