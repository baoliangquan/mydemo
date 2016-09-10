package Thread;

/**
 * Created by bao on 2016/9/5.
 */
public class LockRun {

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                lockTest.serviceA();
            }
        };
        try {
            Thread[] thread = new Thread[10];
            for (int i=0;i<10;i++){
                thread[i] = new Thread(runnable);
                thread[i].start();
            }


            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(lockTest.lock.getQueueLength());
        System.out.println("'**************");

    }
}
