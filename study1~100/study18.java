import java.util.Scanner;

public class study18 {
	
	public static int BLACK = 0;
	public static int WHITE = 0;
	public static int GRAY = 0;
	
	public static int[][] arr;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		partiton(0, 0, n);
		
		System.out.println(BLACK);
		System.out.println(WHITE);
		System.out.println(GRAY);
	}
	
	public static void partiton(int row, int col, int size) {
		
		if(colorCheck(row, col, size)) {
			if(arr[row][col] == -1) {
				BLACK++;
			} else if(arr[row][col] == 0) {
				WHITE++;
			} else {
				GRAY++;
			}
			
			return;
		}
		
		int newsize = size/3;
		
		partiton(row, col, newsize);
		partiton(row, col+newsize, newsize);
		partiton(row, col+2*newsize, newsize);
		
		partiton(row+newsize, col, newsize);
		partiton(row+newsize, col+newsize, newsize);
		partiton(row+newsize, col+2*newsize, newsize);
		
		partiton(row+2*newsize, col, newsize);
		partiton(row+2*newsize, col+newsize, newsize);
		partiton(row+2*newsize, col+2*newsize, newsize);
		
	}
	
	public static boolean colorCheck(int row, int col, int size) {
		
		int color = arr[row][col];
		
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(color != arr[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
