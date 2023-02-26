/**
 * @author Jakub Sykora
 */

import java.util.concurrent.TimeUnit;

/**
 * Stopwatch class that can initiate and display a countdown from 3 select times
 */
public class StopWatch {
    
    private long time;

    /**
     * Starts a countdown of 30 seconds
     */
    public void countDownThirtySec() {
      time = 29;
      startCount();
    }

    /**
     * Starts a countdown of 1 minute
     */
    public void countDownOneMin() {
      time = 59;
      startCount(); 
    }

    /**
     * Starts a countdown of 5 minutes
     */
    public void countDownFiveMin() {
      time = 299;
      startCount();
    }

    /**
     * Initiates a countdown by printing out the given time in the format minutes:seconds
     * for each loop iteration
     */
    private void startCount() {
        try {
            while (time > -1) {
                System.out.print(String.format("%02d:%02d", (time / 60) % 60, (time % 60)));
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                time--;
            }
          }
          catch(Exception e) {
            System.out.println(e);
          }
    }
}
