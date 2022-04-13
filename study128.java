import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class study128 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, String> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			String b = st.nextToken();
		
			map.put(a, b);	
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		List<String> list2 = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			if(map.get(list.get(i)).equals("enter")) {
				list2.add(list.get(i));
			}
		}
		
		Collections.sort(list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			System.out.println(list2.get(i));
		}
		
	}

}
