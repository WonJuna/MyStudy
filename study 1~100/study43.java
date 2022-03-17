import java.util.Arrays;
import java.util.Scanner;

public class study43 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int com = sc.nextInt();
		int idx = sc.nextInt();
		
		int[][] arr = new int[idx][2];
		boolean[] flag = new boolean[com]; 
		
		for(int i=0; i<idx; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		} 
		
		Arrays.fill(flag, false);
		
		DFS(1, flag, arr);
		
		int count = 0;
		for(boolean b : flag) {
			if(b) {
				count++;
			}
		}
		
		System.out.println(count-1);
	}
	
	public static void DFS(int idx, boolean[] flag, int[][] arr) {
		
		flag[idx-1] = true;
		
		for(int i=0; i<arr.length; i++) {
			
			if(!flag[arr[i][1]-1] && arr[i][0]==idx) {
				DFS(arr[i][1], flag, arr);
			}
			if(!flag[arr[i][0]-1] && arr[i][1]==idx) {
				DFS(arr[i][0], flag, arr);
			}
			
		}
		
	}

}
