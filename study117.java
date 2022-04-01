import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class study117 {
	
	static int n;
	static Deque<Snake> deque;
	static int[][] arr;
	static HashMap<Integer, String> map;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	
	static class Snake {
		int x;
		int y; 
		
		public Snake(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		map = new HashMap<>();
		deque = new LinkedList<>();
		
		for(int i=0; i<k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = 1;
		}
		
		int l = Integer.parseInt(br.readLine());
		
		for(int i=0; i<l; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			map.put(a, b);
		}
		
		deque.addFirst(new Snake(1,1));
		arr[1][1] = 2;
		
		System.out.println(play());
	}
	
	public static int play() {
		int time = 1;
		int dir = 1;
		
		while(true) {
			
			Snake head = deque.getFirst();
			
			int nhx = head.x + dx[dir];
			int nhy = head.y + dy[dir];
			
			if(nhx<=0 || nhy<=0 || nhx>n || nhy>n) {
				return time;
			}
			
			if(arr[nhx][nhy]==2) {
				return time;
			}
			
			if(arr[nhx][nhy]==0) {
				Snake tail = deque.pollLast();
				arr[tail.x][tail.y] = 0;
			}
			
			deque.addFirst(new Snake(nhx, nhy));
			arr[nhx][nhy] = 2;
			
			if(map.containsKey(time)) {
				if(map.get(time).equals("L")) {
					dir = (dir+3) % 4;
				} else {
					dir = (dir+1) % 4;
				}
			}
			
			time++;
		}
	}

}
