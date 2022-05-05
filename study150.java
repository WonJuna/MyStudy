
public class study150 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10001];
		
		for(int i=1; i<10000; i++) {
			arr[trans(i)] = 1;
		}
		
		for(int i=1; i<=10000; i++) {
			if(arr[i]==0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static int trans(int a) {
		int b = a;
		
		while(a!=0) {
			b += a%10;
			
			a /= 10;
		}
		
		if(b>10000) {
			return 0;
		} else {
			return b;
		}
		
	}

}
