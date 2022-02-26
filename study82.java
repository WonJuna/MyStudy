import java.util.ArrayList;
import java.util.Scanner;

public class study82 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<t; i++) {
			
			int n = sc.nextInt();
			
			ArrayList<Boolean> list = new ArrayList<Boolean>(n+1);
			list.add(false);
			list.add(false);
			
			for(int j=2; j<=n; j++) {
				list.add(true);
			}
			
			for(int j=2; j*j<=n; j++) {
				if(list.get(j)) {
					for(int k=j*j; k<=n; k+=j) {
						list.set(k, false);
					}
				}
			}
			
			for(int j=n/2; j<=n; j++) {
				if(list.get(j) && list.get(n-j)) {
					sb.append(n-j + " " + j + "\n");
					break;
				}
			}
		}
		System.out.println(sb);
		
	}

}
