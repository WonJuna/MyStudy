import java.util.Arrays;
import java.util.Scanner;

public class study15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int gcdval = arr[1] - arr[0];
		
		for(int i=2; i<n; i++) {
			gcdval = gcd(gcdval, arr[i]-arr[i-1]);
		}
		
		for(int i=2; i<=gcdval; i++) {
			if(gcdval%i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
	}
	
	static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

}
