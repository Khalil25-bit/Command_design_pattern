/**
 * Counts down five minutes
 * @author Jason Sullivan
 */
public class FiveMinCommand implements Command {
    private StopWatch stopwatch;

    /**
     * Create an instance of FiveMinCommand using a StopWatch
     * @param stopWatch The StopWatch that will do the countdown
     */
    public FiveMinCommand(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    /**
     * Starts the countdown by calling the countDownFiveMin method
     */
    public void execute(){
        stopwatch.countDownFiveMin();
    }
}
