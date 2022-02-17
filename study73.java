import java.util.Scanner;

public class study73 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		
		int num = 1;
		int count = 0;
		while(true) {
			
			if(s-num>=0) {
				count++;
				s -= num;
				num++;
				
				if(s==0) {
					break;
				}
			} else {
				break;
			}
			
		}
		
		System.out.println(count);
		
	}

}
