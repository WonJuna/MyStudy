import java.util.Scanner;

public class study58 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1; i<=n; i++) {
			String i2 = String.valueOf(i);
			for(int j=0; j<i2.length(); j++) {
				if(i2.charAt(j)=='3' || i2.charAt(j)=='6' || i2.charAt(j)=='9') {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
