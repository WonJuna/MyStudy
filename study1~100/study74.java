import java.util.Scanner;

public class study74 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[][] a = new long[n+1][2];
		
		a[1][0] = 0;
		a[1][1] = 1;
		
		for(int i=2; i<=n; i++) {
			a[i][0] = a[i-1][0] + a[i-1][1];
			a[i][1] = a[i-1][0];
		}
		
		System.out.println(a[n][0] + a[n][1]);
		
	}

}
