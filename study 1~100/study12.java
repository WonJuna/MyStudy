
public class study12 {
	
	public static void main(String[] args) {
		
		int[] k = {2, 5, 7};
		System.out.println(sum(k));
		
		
	}
	
	public static long sum(int[] a) {
		
		long s = 0;
		for(int i=0; i<a.length; i++) {
			s += a[i];
		}
		
		return s;
		
	}

}
