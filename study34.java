import java.io.BufferedReader;
import java.io.InputStreamReader;

public class study34 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int count = 0;
		char f = '0';
		char s = '1';
		char tmp = 'n';
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(i==0 && c==f) {
				tmp = f;
			} else if(i==0 && c==s) {
				tmp = s;
			}
			
			if(tmp == f) {
				if(i!=0 && c=='1' && str.charAt(i-1)=='0') {
					count++;
				}
			} else if(tmp == s) {
				if(i!=0 && c=='0' && str.charAt(i-1)=='1') {
					count++;
				}
			}
			
		}
		
		System.out.println(count);
	}

}
