/**
 * Counts down one minute
 * @author Jason Sullivan
 */
public class OneMinCommand implements Command {
    private StopWatch stopwatch;

     /**
     * Create an instance of OneMinCommand using a StopWatch
     * @param stopWatch The StopWatch that will do the countdown
     */
    public OneMinCommand(StopWatch stopWatch){
        this.stopwatch = stopWatch;
    }

    /**
     * Starts the countdown by calling the countDownOneMin method
     */
    public void execute(){
        stopwatch.countDownOneMin();
    }
}
