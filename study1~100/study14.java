import java.util.Scanner;

public class study14 {
	
	static int[][][] arr = new int[21][21][21];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			
			sb.append("w("+a+", "+b+", "+c+") = ").append(w(a, b, c)).append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	static int w(int a, int b, int c) {
		
		if(inRange(a,b,c) && arr[a][b][c]!=0) {
			return arr[a][b][c];
		}
		
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		
		if(a>20 || b>20 || c>20) {
			return arr[20][20][20] = w(20, 20, 20);
		}
		
		if(a<b && b<c) {
			return arr[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		
		return arr[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
	}
	
	static boolean inRange(int a, int b, int c) {
		return a>=0 && a<=20 && b>=0 && b<=20 && c>=0 && c<=20;
	}

}
