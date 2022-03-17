import java.util.Arrays;
import java.util.Scanner;

public class study35 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str2 = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=i; j<str.length(); j++) {
				sb.append(str.charAt(j));
			}
			str2[i] = sb.toString();
		}
		
		Arrays.sort(str2);
		
		for(String s : str2) {
			System.out.println(s);
		}
		 
	}

}
