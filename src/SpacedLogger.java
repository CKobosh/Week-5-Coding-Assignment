
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		StringBuilder builder = new StringBuilder(); 
		for(char c : log.toCharArray()) {
		builder.append(c).append(" "); 
			} 
	System.out.println(builder.toString());	
	}
	
	@Override
	public void error(String error) {
		StringBuilder builder = new StringBuilder(); 
		for(char c : error.toCharArray()) {
		builder.append(c).append(" "); 
			} 
	System.out.println("ERROR: " + builder.toString()); 	
	}

	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
