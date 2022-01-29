import java.util.Scanner;

public class study52 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int k = sc.nextInt();
			int[] arr = new int[k];
			
			for(int j=2; j<=k; j++) {
				for(int f=j; f<=k; f++) {
					if(f%j==0) {
						if(arr[f-1]==1) arr[f-1] = 0;
						else arr[f-1] = 1;
					}
				}
			}
			
			int count = 0;
			for(int a : arr) {
				if(a==0) count++;
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb);
	}

}
