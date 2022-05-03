import java.util.Scanner;

public class study149 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[0]==1) {
			
			for(int i=1; i<8; i++) {
				if(arr[i] == i+1) {
					if(i==7) {
						System.out.println("ascending");
						break;
					}
				} else {
					System.out.println("mixed");
					break;
				}
			}
			
		} else if(arr[0]==8) {
			
			for(int i=1; i<8; i++) {
				if(arr[i] == 8-i) {
					if(i==7) {
						System.out.println("descending");
						break;
					}
				} else {
					System.out.println("mixed");
					break;
				}
			}
			
		} else {
			System.out.println("mixed");
		}
		
	}

}
