import java.util.Scanner;

public class study3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int j = i;
		int count = 0;
		
		while(true) {
		
			int k1 = i % 10; 
			int k2 = (i - k1) / 10; 
		
			int p = (k1 + k2) % 10; 
			
			i = (k1 * 10) + p;
			
			count++;
			
			if (i == j) {
				System.out.print(count);
				break;
			}
		} 
		
		
	}

}
