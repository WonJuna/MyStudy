import java.util.Scanner;

public class study115 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
	
		for(int i=0; i<t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int tx = 0;
			int ty = 0;
			int k = 0;
			
			k += x;
			tx = x;
			ty = x;
			
			while(ty>n) {
				ty -= n;
			}
			
			while(true) {
				if(tx==x && ty==y) {
					sb.append(k + "\n");
					break;
				}
				
				if(k>m*n) {
					sb.append(-1 + "\n");
					break;
				}
				
				k += m;
				ty += m;
				
				while(ty>n) {
					ty -= n;
				}	
			}	
		}
		
		System.out.println(sb);
	}

}
