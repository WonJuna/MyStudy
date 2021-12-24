import java.util.Scanner;

public class study5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.print(fibo(i));
		
		
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
				
	}

}
