import java.io.BufferedReader;
import java.io.InputStreamReader;

public class study134 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dir = br.readLine();
		String word = br.readLine();
		
		int count = 0;
		for(int i=0; i<dir.length(); i++) {
			
			for(int j=0; j<word.length(); j++) {
				if(i+j > dir.length()-1) {
					break;
				}
				if(word.charAt(j)!=dir.charAt(i+j)) {
					break;
				} else if(j==word.length()-1) {
					count++;
					i += word.length()-1;
					break;
				}
			}
		}
		
		System.out.println(count);
		
		
	}

}
