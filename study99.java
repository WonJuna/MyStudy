import java.util.Scanner;

public class study99 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		int count = 0;
		while(true) {
			
			if(a==b) {
				break;
			}
			
			if(b<a) {
				count = -1;
				break;
			}
			
			String str = String.valueOf(b);
			if(b%2 != 0 && str.charAt(str.length()-1) != '1') {
				count = -1;
				break;
			}
			
			if(b % 2 == 0) {
				b = b / 2;
				count++;
			} else {
				str = str.substring(0, str.length()-1);
				b = Long.parseLong(str);
				count++;
			}
			
		}
		
		if(count==-1) {
			System.out.println(count);
		} else {
			System.out.println(count+1);
		}
	}

}
