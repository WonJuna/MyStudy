import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study25 {
	
	public static int k;
	public static int[] s;
	public static boolean[] arr;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		while(true) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			k = Integer.parseInt(st.nextToken());
			
			if(k==0) {
				break;
			}
			
			s = new int[k];
			arr = new boolean[k];
			
			for(int i=0; i<k; i++) {
				s[i] = Integer.parseInt(st.nextToken());
			}
			
			dfs(0, 0);
			
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static void dfs(int line, int count) {
		
		if(count==6) {
			for(int i=0; i<k; i++) {
				if(arr[i]) {
					sb.append(s[i] + " ");
				}
			}
			sb.append("\n");
		}
		
		for(int i=line; i<k; i++) {
			arr[i] = true;
			dfs(i+1, count+1);
			arr[i] = false;
		}
		
	}

}
