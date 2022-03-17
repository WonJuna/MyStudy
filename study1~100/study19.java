import java.util.ArrayList;
import java.util.Scanner;

public class study19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int[] arr = new int[n];
		
		int left, right, mid;
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(0);
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
			
			if(arr[i] > li.get(li.size()-1)) {
				li.add(arr[i]);
			} else {
				left = 1;
				right = li.size()-1;
				
				while(left <= right) {
					mid = (left + right) / 2;
					if(arr[i] > li.get(mid)) {
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				li.set(left, arr[i]);
			}
			
		}
		
		System.out.println(li.size()-1);
		
	}

}
