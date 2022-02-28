import java.util.Scanner;

public class study83 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		
		for(int i=0; i<n; i++) {
			
			String st = sc.next();
			
			boolean[] check = new boolean[26];
			
			for(int j=0; j<st.length()-1; j++) {
				if(st.charAt(j)!=st.charAt(j+1)) {
					if(check[st.charAt(j+1)-97]) {
						count--;
						break;
					}
				}
				
				check[st.charAt(j)-97] = true;
			}
			
		}
		
		System.out.println(count);
		
	}

}
