import java.util.Scanner;

public class study132 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int gcd = arr[1] - arr[0];
		for(int i=2; i<n; i++) {
			gcd = getGcd(gcd, arr[i]-arr[i-1]);
		}
		
		int count = 0;
		for(int i=1; i<n; i++) {
			count += (arr[i]-arr[i-1]) / gcd - 1;
		}
		
		System.out.println(count);
		
	}
	
	public static int getGcd(int a, int b) {
		
		int big = 0;
		int small = 0;
		
		if(a>b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		
		if(small==0) {
			return big;
		}
		
		return getGcd(small, big % small);
		
	}

}
