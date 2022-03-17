import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class study100 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		HashSet<Integer> hs = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			hs.add(sc.nextInt());
		}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			if (hs.contains(sc.nextInt())) {
				sb.append("1" + "\n");
			} else {
				sb.append("0" + "\n");
			}
		}
		
		System.out.println(sb);
		
	}

}
