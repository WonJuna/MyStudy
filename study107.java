import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study107 {
	
	static int r, c, count;
	static Queue<Point> q1, q2;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	static class Point {
		int x;
		int y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[r][c];
		
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
		
		for(int i=0; i<r; i++) {
			String str = br.readLine();
			for(int j=0; j<c; j++) {
				arr[i][j] = str.charAt(j);
				if(arr[i][j]=='S') {
					q1.add(new Point(i, j));
				}
				if(arr[i][j]=='*') {
					q2.add(new Point(i, j));
				}
				
			}
		}
		
		count = 0;
		
		bfs(arr);
		
		System.out.println(count);
		
	}
	
	public static void bfs(char[][] arr) {
		
		while(true) {
			count++;
			
			int size2 = q2.size();
			
			for(int i=0; i<size2; i++) {
				Point p = q2.poll();
				
				for(int j=0; j<4; j++) {
					int newi = p.x + dx[j];
					int newj = p.y + dy[j];
					
					if(newi>=0 && newi<r && newj>=0 && newj<c) {
						if(arr[newi][newj]=='.') {
							arr[newi][newj] = '*';
							q2.add(new Point(newi, newj));
						}
					}
				}
			}
			
			if(q1.size()==0) {
				System.out.println("KAKTUS");
				System.exit(0);
			}
			
			int size1 = q1.size();
			
			for(int i=0; i<size1; i++) {
				Point p = q1.poll();
				
				for(int j=0; j<4; j++) {
					int newi = p.x + dx[j];
					int newj = p.y + dy[j];
					
					if(newi>=0 && newi<r && newj>=0 && newj<c) {
						if(arr[newi][newj]=='D') {
							return;
						}
						if(arr[newi][newj]=='.') {
							arr[newi][newj] = 'S';
							q1.add(new Point(newi, newj));
						}
					}
				}
			}
		}
	
	}

}
