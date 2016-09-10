package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by bao on 2016/9/5.
 */
public class LockTest {
    public ReentrantLock lock = new ReentrantLock();
    public Condition condition =lock.newCondition();
    public void serviceA(){

        try {
            lock.lock();
            System.out.println(lock.isFair());
            System.out.println("serviceA:有几个在等待"+lock.getWaitQueueLength(condition));
            condition.signalAll();
            System.out.println("serviceA:"+lock.getHoldCount());
            serviceB();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void serviceB(){
       try {
           lock.lock();
           Thread.sleep(1000);
           System.out.println("serviceB:"+lock.getHoldCount());
           serviceC();
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           lock.unlock();
       }
    }

    public void serviceC(){
        try {
            lock.lock();
            condition.await();
            System.out.println("serviceC:"+lock.getHoldCount());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
