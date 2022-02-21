import java.util.Scanner;

public class study76 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		long[] p = new long[101];
		
		p[1] = 1;
		p[2] = 1;
		p[3] = 1;
		
		for(int i=4; i<=100; i++) {
			p[i] = p[i-3] + p[i-2];
		}
		
		for(int i=0; i<t; i++) {
			int n = sc.nextInt();
			
			sb.append(p[n] + "\n");
		}
		
		System.out.println(sb);
		
	}

}
