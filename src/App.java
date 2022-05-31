import java.util.Date;

public class App {

	public static void main(String[] args) {
		
		Date date = new Date(); 
		
		Logger loggerA = new AsteriskLogger(); 
		loggerA.log("Today"); 
		System.out.println(" ");
		loggerA.error(date.toString());
		System.out.println(" ");
		
		loggerA.close(); 
	 
		Logger loggerB = new SpacedLogger(); 
		loggerB.log("May 30th"); 
		System.out.println(" ");
		loggerB.error("Memorial Day");
		
		loggerB.close(); 
	
	}
}
