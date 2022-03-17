import java.util.Scanner;

public class study32 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		
		for(int i=0; i<10; i++) {
			n[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += n[i];
			
			if(sum < 100) {
				if(i == 9) {
					System.out.println(sum);
					break;
				}
				continue;
			} else if(sum == 100) {
				System.out.println(100);
				break;
			} else {
				int m1 = sum - 100;
				int m2 = 100 - (sum - n[i]);
				
				if(m1 > m2) {
					System.out.println(sum - n[i]);
					break;
				} else {
					System.out.println(sum);
					break;
				}
				
			}
			
		}
		
	}

}
