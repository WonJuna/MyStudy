import java.util.Scanner;

public class study37 {
	
	public static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		aNumber(0, 0);
		
	}
	
	public static void aNumber(int num, int len) {
		
		if(len==n) {
			System.out.println(num);
			return;
		}
		
		for(int i=1; i<=9; i++) {
			if(prime(num*10+i)) {
				aNumber(num*10+i, len+1);
			}
		}
	}
	 
	public static boolean prime(int x) {
		
		if(x==1) {
			return false;
		}
		if(x==2) {
			return true;
		}
		
		for(int j=2; j<x; j++) {
			if(x%j == 0) {
				return false;
			}
		}
		
		return true;
	}

}
