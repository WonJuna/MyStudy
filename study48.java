import java.util.Scanner;

public class study48 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		int max=-2000000, min=2000000;
		for(int i=0; i<n; i++) {
			max = Math.max(max, arr[i][0]+arr[i][1]);
			min = Math.min(min, arr[i][0]+arr[i][1]);
		}
		
		int tmp1 = max - min;
		
		max=-2000000;
		min=2000000;
		for(int i=0; i<n; i++) {
			max = Math.max(max, arr[i][0]-arr[i][1]);
			min = Math.min(min, arr[i][0]-arr[i][1]);
		}
		
		int tmp2 = max - min;
		
		System.out.println(Math.max(tmp1, tmp2));
	}

}
