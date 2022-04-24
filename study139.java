import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class study139 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			
			int m = Integer.parseInt(br.readLine());
			
			sb.append((m/2 + 1) + "\n");
			
			List<Integer> list = new ArrayList<>();
			int cnt = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=1; j<=m; j++) {
				
				list.add(Integer.parseInt(st.nextToken()));
				
				if(j%2==1) {
					Collections.sort(list);
					
					sb.append(list.get(j/2) + " ");
					cnt++;
	
					if(cnt%10==0) {
						sb.append("\n");
					}
				}
				
				if(j%10==0) {
					st = new StringTokenizer(br.readLine(), " ");
				}
				
				if(j==m) {
					sb.append("\n");
				}
				
			}
			
		}
		
		System.out.println(sb);
		
	}

}
