import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class study33 {
	
	public static int n, m, next_i, next_j, cheese, ni, nj;
	public static int[][] arr;
	public static boolean[][] visited;
	public static boolean[][] melt;
	public static int count = 0;
	public static int time = 0;
	public static int[] di = {0,1,0,-1};
	public static int[] dj = {1,0,-1,0};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		melt = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st2.nextToken());
				
				if(arr[i][j]==1) {
					count++;
				}
			}
		}
		
		while(count!=0) {
			
			cheese = count;
			time++;
			
			Melting();
			
			Clear();
			
		}
		
		System.out.println(time);
		System.out.println(cheese);
		
	}
	
	public static void Melting() {
		visited = new boolean[n][m];
		Queue<Pos> q = new LinkedList<Pos>();
		melt[0][0] = true;
		q.offer(new Pos(0,0));
		
		while(!q.isEmpty()) {
			Pos tmp = q.poll();
			for (int k=0; k<4; k++) {
				next_i = tmp.i + di[k];
				next_j = tmp.j + dj[k];
				if(next_i<0 || next_j<0 || next_i>=n || next_j>=m) {
					continue;
				}
				if(visited[next_i][next_j]!=true && arr[next_i][next_j]!=1) {
					visited[next_i][next_j] = true;
					melt[next_i][next_j] = true;
					q.offer(new Pos(next_i, next_j));
				}
				
			}
		}
	}
	
	public static void Clear() {
		visited = new boolean[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(isEdge(i, j)) {
					visited[i][j] = true;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(visited[i][j]==true) {
					if(arr[i][j]==1) {
						count--;
					}
					arr[i][j] = 0;
					melt[i][j] = true;
				}
			}
		}
	}
	
	public static boolean isEdge(int i, int j) {
		for(int k=0; k<4; k++) {
			ni = i + di[k];
			nj = j + dj[k];
			if(ni<0 || nj<0 || ni>=n || nj>=m) {
				continue;
			}
			if(melt[ni][nj]==true) {
				return true;
			}
		}
		return false;
	}
	
	
 
}

class Pos {
	int i, j;
	
	public Pos(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
}
