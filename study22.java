import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class study22 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<k; i++) {
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			
			int n = sc.nextInt();
			
			for(int j=0; j<n; j++) {
				String str = sc.next();
				String cate = sc.next();
				
				if(hm.containsKey(cate)) {
					hm.put(cate, hm.get(cate)+1);
				} else {
					hm.put(cate, 1);
				}
			}
			
			int answer = 1;
			Set<String> set = hm.keySet();
			for(String key : set) {
				answer *= (hm.get(key)+1);
			}
			answer -= 1;
			
			sb.append(answer + "\n");
		}
		
		System.out.println(sb);	
	}

}
