import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class study28 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<k; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			List<Integer> li = new LinkedList<Integer>();
			
			for(int j=0; j<n; j++) {
				int im = sc.nextInt();
				
				li.add(im);
			}
			
			int count = 0;
			while(true) {
				for(int f=1; f<li.size(); f++) {
					if(li.get(0)<li.get(f)) {
						int tmp = li.get(0);
						
						if(m==0) {
							m = li.size()-1;
						} else {
							m--;
						}
						
						li.remove(0);
						li.add(tmp);
						f = 0;
						continue;
					}
				}
				
				if(m==0) {
					++count;
					break;
				}
				
				li.remove(0);
				m--;
				count++;
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb);
	}

}
