import java.util.Scanner;

public class study152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String s = sc.nextLine();
			
			if(s.equals("0")) {
				break;
			}
			
			if(s.length()==1) {
				System.out.println("yes");
			} else {
				for(int i=0; i<s.length()/2; i++) {
					if(s.charAt(i)!=s.charAt((s.length()-1)-i)) {
						System.out.println("no");
						break;
					} else if(i==(s.length()/2)-1) {
						System.out.println("yes");
						break;
					}
				}
			}
			
		}
		 
	}

}
