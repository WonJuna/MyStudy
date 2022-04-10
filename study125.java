import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class study125 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			
			String str = br.readLine();
			
			if(!map.containsKey(str)) {
				map.put(str, 1);
			} else {
				map.put(str, map.get(str)+1);
			}	
		}
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		
		List<String> listname = new ArrayList<>();
		
		int max = -1;
		
		for(int i=0; i<list.size(); i++) {
			int s = map.get(list.get(i));
			
			if(max==-1) {
				max = s;
				listname.add(list.get(i));
			} else {
				if(max==map.get(list.get(i))) {
					listname.add(list.get(i));
				}
			}
		}
		
		Collections.sort(listname);
		
		System.out.println(listname.get(0));
		
	}

}
