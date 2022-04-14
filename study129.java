import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class study129 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] str = new String[n+1];
		
		for(int i=1; i<=n; i++) {
			String s = br.readLine();
			map.put(s, i);
			str[i] = s;
		}
		
		for(int i=0; i<m; i++) {
			String s = br.readLine();
			
			if(isNum(s)) {
				sb.append(str[Integer.parseInt(s)] + "\n");
			} else {
				sb.append(map.get(s) + "\n");
			}
			
		}
		
		System.out.println(sb);
		
	}
	
	public static boolean isNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}

}
