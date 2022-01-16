import java.util.Scanner;

public class study38 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		double d2 = Math.sqrt(Math.pow(h, 2) +  Math.pow(w, 2));
		
		int h2 = (int) Math.floor((h*(d/d2)));
		int w2 = (int) Math.floor((w*(d/d2)));
		
		System.out.println(h2 + " " + w2);
		
	}

}
