/**
 * @author Jakub Sykora
 */

import java.util.concurrent.TimeUnit;

public class StopWatch {
    
    private long time;

    public void countDownThirtySec() {
      time = 299;
      startCount(time);
    }

    public void countDownOneMin() {
      time = 299;
      startCount(time); 
    }

    public void countDownFiveMin() {
      time = 299;
      startCount(time);
    }

    private void startCount(long time) {
        try {
            while (time > -1) {
                System.out.print(String.format("%02d:%02d", (time / 60) % 60, (time % 60)));
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                time--;
            }
            System.out.println(String.format("%02d:%02d", (time / 60) % 60, (time % 60)));
          }
          catch(Exception e) {
            System.out.println(e);
          }
    }
}
