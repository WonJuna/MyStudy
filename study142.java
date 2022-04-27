import java.util.Scanner;

public class study142 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(rev(rev(x)+rev(y)));
		
	}
	
	public static int rev(int a) {
		
		if(a<10) {
			return a;
		}
		else if(a<100) {
			return (a/10) + ((a%10)*10);
		}
		else if(a<1000) {
			return (a/100) + (((a%100)/10)*10) + (a%10)*100;
		}
		else {
			return (a/1000) + (((a%1000)/100)*10) + (((a%100)/10)*100) + ((a%10)*1000);
		}
		
	}

}
