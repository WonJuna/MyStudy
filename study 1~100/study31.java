import java.util.Scanner;

public class study31 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				sum += str.charAt(i) - 'a' + 1;
			} else {
				sum += str.charAt(i) - 'A' + 27;
			}
		}
		
		if(sum==1 || sum==2) {
			System.out.println("It is a prime word.");
		} else {
			for(int i=2; i<sum; i++) {
				if(sum % i == 0) {
					System.out.println("It is not a prime word.");
					break;
				} else if(i==sum-1) {
					System.out.println("It is a prime word.");
				}
			}
		}
		
		
	}

}
