
public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String star = "*".repeat(error.length() + 13); 
		System.err.println(star); 
		System.err.println("***Error: " + error + "***" );
		System.err.println(star); 
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
}
