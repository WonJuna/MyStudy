import java.io.BufferedReader;
import java.io.InputStreamReader;

public class study146 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = 0;
		for(int i=1; i<=8; i++) {
			String[] str = br.readLine().split("");
			
			if(i%2==1) {
				for(int j=0; j<8; j+=2) {
					if(str[j].equals("F")) {
						cnt++;
					}
				}
			} else {
				for(int j=1; j<8; j+=2) {
					if(str[j].equals("F")) {
						cnt++;
					}
				}
			}
		}
		
		System.out.println(cnt);
		
	}

}
