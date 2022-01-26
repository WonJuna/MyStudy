import java.util.Scanner;

public class study49 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		
		int a = (x2-x1)*(y3-y2)-(y2-y1)*(x3-x2);
		
		if(a==0) {
			System.out.println(0);
		} else if(a>0) {
			System.out.println(1);
		} else {
			System.out.println(-1);
		}
	}

}
