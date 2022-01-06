import java.util.*;
import java.io.*;

public class study26 {
	
	public static int n, m;
	
	public static int[][] arr;
	public static int[][] sum;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		sum = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			for(int j=0; j<m; j++) {
				arr[i][j] = input.charAt(j);
			}
		}
		
		bfs(0, 0);
		
		System.out.println(sum[n-1][m-1]);
		
	}
	
	public static void bfs(int i, int j) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(i*100 + j);
		sum[0][0] = 1;
		int pos = 0;
		
		while(q.isEmpty()==false) {
			pos = q.poll();
			i = pos/100;
			j = pos%100;
			
			if(i>0 && arr[i-1][j]=='1' && sum[i-1][j]==0) {
				sum[i-1][j] = sum[i][j] + 1;
				q.offer((i-1)*100+j);
			}
			if(i<n-1 && arr[i+1][j]=='1' && sum[i+1][j]==0) {
				sum[i+1][j] = sum[i][j] + 1;
				q.offer((i+1)*100+j);
			}
			if(j>0 && arr[i][j-1]=='1' && sum[i][j-1]==0) {
				sum[i][j-1] = sum[i][j] + 1;
				q.offer(i*100+j-1);
			}
			if(j<m-1 && arr[i][j+1]=='1' && sum[i][j+1]==0) {
				sum[i][j+1] = sum[i][j] + 1;
				q.offer(i*100+j+1);
			}
		
		}
	}

}
