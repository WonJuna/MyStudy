import java.util.Scanner;

public class study60 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int tmp = -1;
		int count = 0;
		for(int i=n-1; i>=0; i--) {
			
			if(i==n-1) {
				tmp = arr[i];
				count++;
			} else {
				if(arr[i]>tmp) {
					tmp = arr[i];
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
