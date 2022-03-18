import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class study102 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		StringBuilder sb = new StringBuilder();
		
		String[] s = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(s[i]);
			
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
			
		}
		
		int m = Integer.parseInt(br.readLine());
		s = br.readLine().split(" ");
		for(int i=0; i<m; i++) {
			int a = Integer.parseInt(s[i]);
			
			if(map.containsKey(a)) {
				sb.append(map.get(a) + " ");
			} else {
				sb.append("0" + " ");
			}
		}
		
		System.out.println(sb);
		
	}

}
