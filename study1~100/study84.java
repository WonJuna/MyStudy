import java.util.Scanner;

public class study84 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String[] a = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for(int i=0; i<a.length; i++) {
			if(str.contains(a[i])) {
				str = str.replaceAll(a[i], "?");
			}
		}
		
		System.out.println(str.length());
		
	}

}
