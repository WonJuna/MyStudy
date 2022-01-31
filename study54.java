import java.util.Arrays;
import java.util.Scanner;

public class study54 {
	
	static int[][] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		arr = new int[31][31];
		
		for(int i=0; i<arr.length; i++) {
			Arrays.fill(arr[i], -1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			sb.append(combi(m, n) + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static int combi(int m, int n) {
		
		if(m==n || n==0) {
			return 1;
		}
		
		if(arr[m][n]==-1) {
			return arr[m][n] = combi(m-1, n-1) + combi(m-1, n);
		}
		
		return arr[m][n];
	}

}
