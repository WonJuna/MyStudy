import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class study51 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int tmp = 0;
		for(int i=0; i<5; i++) {
			for(int j=1; j<5-i; j++) {
				if(arr[j]<arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					
					for(int k : arr) {
						System.out.print(k + " ");
					}
					System.out.println();
				}
			}
		}
		
	}

}
