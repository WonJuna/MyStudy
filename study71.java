import java.util.Scanner;

public class study71 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int[] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)-'a']++;
		}
		
		int max = -1;
		char answer = ' ';
		for(int i=0; i<26; i++) {
			if(max < count[i]) {
				max = count[i];
				answer = (char) (i+65);
			} else if(max == count[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
	}

}
