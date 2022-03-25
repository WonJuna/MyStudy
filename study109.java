import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class study109 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] time = new int[n][2];
		
		for(int i=0; i<n; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1]==o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		
		int count = 0;
		int end = 0;
		
		for(int i=0; i<n; i++) {
			if(end <= time[i][0]) {
				end = time[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
