import java.util.Scanner;

public class study124 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		int answer = 0;
		while(true) {
			
			int l = sc.nextInt();
			int p = sc.nextInt();
			int v = sc.nextInt();
			
			if(l==0 && p==0 && v==0) {
				break;
			}
			
			if(v%p<=l) {
				answer = (v/p)*l + (v%p);
			} else {
				answer = (v/p)*l + l;
			}
			
			sb.append("Case " + count + ": " + answer + "\n");
			
			count++;
		}
		
		System.out.println(sb);
		
	}

}
