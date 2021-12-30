import java.util.Scanner;

public class study11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		boolean[] arr = new boolean[n+1];
		
		for(int i=2; i<arr.length; i++) {
			arr[i] = true;
		}
		
		for(int i=2; i<=n; i++) {
			if(arr[i]) {
				for(int j=2; j<=n/i; j++) {
					arr[i*j] = false;
				}
			}
		}
		
		int sum=0;
		int min=-1;
		
		for(int i=m; i<=n; i++) {
			if(arr[i]) {
				if(min==-1) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(sum>0) {
			System.out.println(sum);
		}
		
		System.out.println(min);
		
		
	}

}
