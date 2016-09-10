package Thread;

/**
 * Created by bao on 2016/9/4.
 */
public class Run {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();
        try {
            Thread.sleep(1000);
            a.service();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
