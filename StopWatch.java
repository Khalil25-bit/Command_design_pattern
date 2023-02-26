/**
 * @author Jakub Sykora
 */

import java.util.concurrent.TimeUnit;

public class StopWatch {
    
    private long time;

    public void countDownThirtySec() {

    }

    public void countDownOneMin() {

    }

    public void countDownFiveMin() {

    }

    private void startCount(long time) {
        long s = 0;
        long m = 0;
        try {
            while (time > -1) {
                m = (time / 60) % 60;
                s = (time % 60);
                System.out.print(String.format("%02d:%02d",m,s));
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.print("\033[H\033[2J");
                System.out.flush();
                time--;
            }
            System.out.println(String.format("%02d:%02d",m,s));
          }
          catch(Exception e) {
            System.out.println(e);
          }
    }
}
