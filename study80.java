import java.util.Arrays;
import java.util.Scanner;

public class study80 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ns = String.valueOf(n);
		
		int[] arr = new int[9];
		
		for(int i=0; i<ns.length(); i++) {
			
			char k = ns.charAt(i);
			int ki = Integer.parseInt(String.valueOf(k));
			
			if(ki==9) {
				ki = 6;
			}
			
			arr[ki]++;
		}
		
		arr[6] = (arr[6]+1) / 2;
		
		Arrays.sort(arr);
		
		System.out.println(arr[8]);
	}

}
