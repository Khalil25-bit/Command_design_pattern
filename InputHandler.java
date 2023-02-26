/**
 * 
 * @author Khalil Johnson
 *
 */
import java.util.HashMap;

public class InputHandler {

	public InputHandler(StopWatch watch) {
		
	 HashMap<String, Command> commands  = new HashMap<>();
	 Command onemin = new OneMinCommand(watch);
	 Command fivemin = new FiveMinCommand(watch);
	 Command thirtysec = new ThirtySecCommand(watch);
	 
	 commands.put("1", onemin);
	 commands.put("5", fivemin);
	 commands.put("30", thirtysec);
	
	}
	
	public boolean inputEntered(String data) {
		if(!commands.containsKey(data)) return false;
		commands.get(data).execute();
		return true;
			
		
	}
}
