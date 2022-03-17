import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class study29 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] list = new int[n];
		
		for(int i=0; i<n; i++) {
			int mw = Integer.parseInt(br.readLine());
			list[i] = mw;
		}
		
		Arrays.sort(list);
		
		for(int i=0; i<n; i++) {
			list[i] = list[i] * (n-i);
		}
		
		Arrays.sort(list);
		
		System.out.println(list[n-1]);
		
	}
	

}
