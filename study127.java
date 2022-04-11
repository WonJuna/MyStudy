import java.util.Scanner;

public class study127 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] s = str.split("");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length; i++) {
			int num = Integer.parseInt(s[i]);
			
			if(i!=0 && num<=1) {
				sb.append("00");
			}
			else if(i!=0 && (num==2 || num==3)) {
				sb.append("0");
			}
			
			sb.append(Integer.toBinaryString(num));
		}
		
		System.out.println(sb);
		
	}

}
