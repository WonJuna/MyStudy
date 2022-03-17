import java.util.Scanner;

public class study21 {
	
	public static int BLACK=0;
	public static int WHITE=0;
	
	public static int[][] arr;
	public static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			
			}
		}
		
		partition(0, 0, n);
		
		System.out.println(BLACK);
		System.out.println(WHITE);
		
	}
	
	public static void partition(int row, int col, int size) {
		
		if(colorCheck(row, col, size)) {
			if(arr[row][col]==0) {
				BLACK++;
			} else {
				WHITE++;
			}
			
			return;
		}
		
		int newsize = size/2;
		
		partition(row, col, newsize);
		partition(row, col+newsize, newsize);
		
		partition(row+newsize, col, newsize);
		partition(row+newsize, col+newsize, newsize);
		
		
	}
	
	public static boolean colorCheck(int row, int col, int size) {
		
		int color = arr[row][col];
		
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(arr[i][j]!=color) {
					return false;
				}
			}
		}
		
		return true;
		
	}

}
