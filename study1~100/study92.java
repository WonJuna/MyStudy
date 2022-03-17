import java.util.Scanner;

public class study92 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = 1;
		int count = 0;
		
		while(n>0) {
			n -= a;
			count++;
			a = 6 * count;
		}
		
		System.out.println(count);
		
	}

}
