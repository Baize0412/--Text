package xxgame;

public class Edit {
    public void millis(int millis) {
        try {   //等待时间
            Thread.sleep(millis);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }
}
