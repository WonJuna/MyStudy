import java.util.Scanner;

public class study98 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(b+c >= 60) {
			b += c;
			
			while(b >= 60) {
				b -= 60;
				a++;
			}
			
			if(a <= 23) {
				System.out.print(a + " " + b);
			} else {
				
				while(a >= 24) {
					a -= 24;
				}
				
				System.out.print(a + " " + b);
			}
			
		} else {
			System.out.print(a + " " + (b+c));
		}
		
	}

}
