import java.text.SimpleDateFormat;
import java.util.Date;

public class study145 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
		
		System.out.println(format.format(today));
		
	}
}
