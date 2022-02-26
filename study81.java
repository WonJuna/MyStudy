import java.util.Scanner;

public class study81 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			
			if(i<100) {
				count++;
				continue;
			}
			
			int a = i / 100;
			int b = (i / 10) % 10;
			int c = i % 10;
			
			if((a-b)==(b-c)) {
				count++;
			}
			
		}
		
		System.out.println(count);
		
	}

}
