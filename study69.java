import java.io.BufferedReader;
import java.io.InputStreamReader;

public class study69 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int[] d;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			d = new int[n+1];
			
			for(int j=0; j<=n; j++) {
				if(j==0) {
					d[j] = 0;
				} else if(j==1) {
					d[j] = 1;
				} else if(j==2) {
					d[j] = 2;
				} else if(j==3) {
					d[j] = d[j-1] + d[j-2] + 1;
				} else {
					d[j] = d[j-1] + d[j-2] + d[j-3];
				}
			}
			
			sb.append(d[n] + "\n");
		}
		
		System.out.println(sb);
		
		
	}		
}
