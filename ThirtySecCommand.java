/**
 * Counts down 30 seconds
 * @author Anthony Leeb
 */
public class ThirtySecCommand implements Command{
  private StopWatch stopwatch;
  /**
   * creates a ThirtySecCommand taking in a StopWatch
   * @param stopWatch an instance of the StopWatch class that has the ability to count down
   */
  public ThirtySecCommand(StopWatch stopWatch){
    this.stopwatch = stopWatch;
  }
  /**
   * starts the countdown from thirty seconds 
   */
  public void execute(){
    stopwatch.countDownThirtySec();
  }
}
