import java.util.Scanner;

public class study86 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int[] numCount = new int[10];
		
		StringBuilder sb = new StringBuilder();
		
		int total = 0;
		for(int i=0; i<n.length(); i++) {
			int num = Integer.parseInt(n.substring(i, i+1));
			numCount[num]++;
			total += num;
		}
		
		if(numCount[0]==0 || total % 3 != 0) {
			System.out.println("-1");
			return;
		}
		
		for(int i=9; i>=0; i--) {
			while(numCount[i]>0) {
				sb.append(i);
				numCount[i]--;
			}
		}
		
		System.out.println(sb);
		
	}

}
