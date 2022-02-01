import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class study56 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		int size = 0;
		int score = 0;
		for(int i=n-1; i>0 ; i--) {
			
			size = list.get(i) + list.get(i-1);;
			score +=  list.get(i) * list.get(i-1);
			
			list.remove(i);
			list.set(i-1, size);
		}
		
		System.out.println(score);
	}

}
