import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class study30 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			
			String st = br.readLine();
			
			int count = 0;
			int sum = 0;
			for(int j=0; j<st.length(); j++) {
				
				if(st.charAt(j)=='O') {
					count++;
				} else {
					count = 0;
				}
				
				sum += count;
			}
			
			sb.append(sum + "\n");
			
		}
		
		System.out.println(sb);	
	}

}
