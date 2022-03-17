import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class study55 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		List<String> list = new ArrayList<String>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n+m; i++) {
			list.add(br.readLine());
		}
		
		Collections.sort(list);
		
		int count = 0;
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i).equals(list.get(i+1))) {
				count++;
				sb.append(list.get(i) + "\n");
			}
		}
		
		System.out.println(count);
		System.out.println(sb);
	}

}
