package Thread;

/**
 * Created by bao on 2016/9/4.
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName()+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void service(){
        System.out.println("结束时间"+Thread.currentThread().getName()+System.currentTimeMillis());
    }
}
