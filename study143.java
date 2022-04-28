import java.util.Scanner;
import java.util.TreeSet;

public class study143 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		TreeSet<Long> a2 = new TreeSet<>();
		
		for(int i=0; i<a; i++) {
			a2.add(sc.nextLong());
		}
		
		for(int i=0; i<b; i++) {
			long b2 = sc.nextLong();
			
			if(a2.contains(b2)) {
				a2.remove(b2);
			}
		}
		
		System.out.println(a2.size());
		
		for(long f : a2) {
			System.out.print(f + " ");
		}
		
	}
	

}
