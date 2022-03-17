import java.util.Scanner;
import java.util.Stack;

public class study10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		int sum = 0;
		
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) { 
			arr[i] = sc.nextInt();
			
			if(arr[i]==0) {
				st.pop();
			} else {
				st.push(arr[i]);
			}
		}
		
		while(!st.isEmpty()) {
			sum += st.pop();
		}
		
		System.out.println(sum);
		
	}

}
