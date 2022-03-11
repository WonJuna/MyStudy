import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair {
	int x;
	int y;
	
	Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class study95 {
	
	static int n, m;
	static int[][] arr, copyarr;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int max = -1;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][m];
		copyarr = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		wall(0);
		
		System.out.println(max);
	}
	
	public static void wall(int count) {
		if(count==3) {
			virus();
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr[i][j]==0) {
					arr[i][j] = 1;
					wall(count + 1);
					arr[i][j] = 0;
				}
			}
		}
	}
	
	public static void virus() {
		Queue<Pair> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				copyarr[i][j] = arr[i][j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(copyarr[i][j]==2) {
					queue.add(new Pair(i,j));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Pair p = queue.poll();
			
			for(int i=0; i<4; i++) {
				int newx = p.x + dx[i];
				int newy = p.y + dy[i];
				
				if(newx>=0 && newx<n && newy>=0 && newy<m) {
					if(copyarr[newx][newy]==0) {
						copyarr[newx][newy] = 2;
						queue.add(new Pair(newx,newy));
					}
				}
			}
		}
		
		safe();
	}
	
	public static void safe() {
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(copyarr[i][j]==0) {
					cnt++;
				}
			} 
		}
		
		max = Math.max(max, cnt);
	}

}
