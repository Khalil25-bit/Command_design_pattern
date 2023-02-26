/**
 * 
 * @author Khalil Johnson
 *
 */
import java.util.HashMap;

public class InputHandler {
	HashMap<String, Command> commands;
	/**
	 * @param watch stopwatch object to use timers
	 */
	public InputHandler(StopWatch watch) {
		
	 commands  = new HashMap<>();	 
	 Command onemin = new OneMinCommand(watch);
	 Command fivemin = new FiveMinCommand(watch);
	 Command thirtysec = new ThirtySecCommand(watch);
	 
	 commands.put("1", onemin);
	 commands.put("5", fivemin);
	 commands.put("30", thirtysec);
	
	}
	/**
	 * @param data The command used to run a stop watch
	 * @return whether or not the timer starts
	 */
	public boolean inputEntered(String data) {
		if(!commands.containsKey(data)) return false;
		commands.get(data).execute();
		return true;
			
		
	}
}
