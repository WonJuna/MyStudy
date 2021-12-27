import java.util.Scanner;

public class study8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("-");
		
		int sum = Integer.MAX_VALUE;
		
		for(int i=0; i<s.length; i++) {
			int tmp = 0;
			
			String[] p = s[i].split("\\+");
			
			for(int j=0; j<p.length; j++) {
				tmp += Integer.parseInt(p[j]);
			}
			
			if(sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {
				sum -= tmp;
			}
		}
		
		System.out.println(sum);
		
	}

}
