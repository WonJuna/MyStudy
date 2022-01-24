import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study47 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String start = st.nextToken();
		int answer = 1;
		
		for(int i=0; i<n-1; i++) {
			String next = st.nextToken();
			
			if(start.charAt(start.length()-1)!=next.charAt(0)) {
				answer = 0;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
