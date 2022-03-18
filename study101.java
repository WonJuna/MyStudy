import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class study101 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			
			int index = -1;
			for(int j=0; j<str.length(); j++) {
				
				char c = str.charAt(j);
				
				if(c=='(') {
					stack.push('(');
					index++;
				} else if(c==')' && index>-1) {
					stack.pop();
					index--;
				} else {
					index--;
				}
			}
			
			if(index==-1 && stack.size()==0) {
				bw.write("YES" + "\n");
			} else {
				bw.write("NO" + "\n");
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
