import java.util.Arrays;
import java.util.Scanner;

public class study118 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] alpha = new int[26];
		
		for(int i=0; i<n; i++) {
			String str = sc.next();
			
			int length = str.length();
			
			for(int j=0; j<str.length(); j++) {
				alpha[str.charAt(j) - 'A'] += Math.pow(10,length-1);
				length--;
			}
		}
		
		Arrays.sort(alpha);
		
		int ans = 0;
		
		for(int i=25; i>=17; i--) {
			ans += (i-16) * alpha[i];
		}
		
		System.out.println(ans);
	}

}
