import java.util.Scanner;

public class study153 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		if(t%10 != 0) {
			System.out.println(-1);
		} else {
			while(true) {
				
				if(t==0) {
					System.out.println(a + " " + b + " " + c);
					break;
				}
				
				if(t>=300) {
					t-=300;
					a++;
				} else if(t>=60) {
					t-=60;
					b++;
				} else {
					t-=10;
					c++;
				}
				
			}
		}
		
	}

}
