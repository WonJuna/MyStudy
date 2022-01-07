import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class study27 {
	
	public static ArrayList<Integer>[] list;
	public static boolean[] check;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();
		
		list = new ArrayList[n+1];
		
		for(int i=1; i<n+1; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i=1; i<n+1; i++) {
			Collections.sort(list[i]);
		}
		
		check = new boolean[n+1];
		dfs(v);
		System.out.println();
		
		check = new boolean[n+1];
		bfs(v);
		System.out.println();
		
	}
	
	public static void dfs(int v) {
		
		if(check[v]) {
			return;
		}
		
		check[v] = true;
		System.out.print(v + " ");
		for(int x : list[v]) {
			if(!check[x]) {
				dfs(x);
			}
		}
		
	}
	
	public static void bfs(int v) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		check[v] = true;
		
		while(!q.isEmpty()) {
			
			int x = q.poll();
			System.out.print(x + " ");
			
			for(int y : list[x])
				if(!check[y]) {
					check[y] = true;
					q.add(y);
				}
			
		}
		
	}

}
