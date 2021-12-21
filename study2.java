import java.util.Scanner;

public class study2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		
		for(int j=0; j<i; j++) {
			arr[j] = sc.nextInt();
		}
		
		int tmp;
		
		for(int j=0; j<i; j++) {
			for(int k=j+1; k<i; k++) {
				if(arr[j] > arr[k]) {
					tmp = arr[k];
					arr[k] = arr[j];
					arr[j] = tmp;
				}
				
			}
		}
		
		for(int j=0; j<i; j++) {
			System.out.printf("%d\n", arr[j]);
		}
		
		
	}

}
