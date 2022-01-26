import java.util.Scanner;

public class study50 {
	
	static int count;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 10;
		arr[3] = 50;
		
		boolean[] visit = new boolean[50*20+1];
		
		combi(n, arr, 0, 0, 0, visit);
		
		System.out.println(count);
		
	}
	
	public static void combi(int n, int[] arr, int idx, int cnt, int sum, boolean[] visit) {
		
		if(cnt==n) {
			if(!visit[sum]) {
				visit[sum] = true;
				count++;
			}
			return;
		}
		
		for(int i=idx; i<arr.length; i++) {
			combi(n, arr, i, cnt+1, sum+arr[i], visit);
		}
		
	}

}
