import java.util.Scanner;

public class study4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int[] p = new int[i];

		for(int j=0; j<i; j++) {
			p[j] = sc.nextInt();
		}
		
		int tmp;
		for(int j=0; j<i; j++) {
			for(int k=j+1; k<i; k++) {
				if(p[k]<p[j]) {
					tmp = p[k];
					p[k] = p[j];
					p[j] = tmp;	
				}	
			}
		}
		
		int sum = 0;
		for(int j=0; j<i; j++) {
	
			sum += p[j]*(i-j);
		}
		
		System.out.print(sum);
	}
	

}
