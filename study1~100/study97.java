import java.util.Scanner;

public class study97 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int min = 1000;
		
		min = Math.min(min, h-y);
		min = Math.min(min, y);
		min = Math.min(min, x);
		min = Math.min(min, w-x);
		
		System.out.println(min);
		
	}

}
