import java.util.Scanner;

public class study6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int count = 0;
		
		while(true) {
		
			if(i%5 == 0) {
				System.out.println(i/5 + count);
				break;
			} else if(i < 0) {
				System.out.println(-1);
				break;
			}
				
			i -= 3;
			count++;
			
		}
		
	}

}
