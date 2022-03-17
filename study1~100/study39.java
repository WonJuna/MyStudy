import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study39 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int time = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int t = Integer.parseInt(st.nextToken());
			String z = st.nextToken();
			
			if(z.equals("T")) {
				time += t;
				
				if(time >= 210) {
					System.out.println(k);
					break;
				}
				
				if(k==8) {
					k = 1;
				} else {
					k++;
				}
			} else {
				time += t;
				
				if(time >= 210) {
					System.out.println(k);
					break;
				}
			} 
			
			
			
		}
	}

}
