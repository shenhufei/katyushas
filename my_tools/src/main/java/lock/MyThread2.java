package lock;

import java.util.Vector;

/**
 * @author shenhufei
 * @version 1.0
 * @Description:
 * @date 20200619
 */
public class MyThread2 extends Thread {
    @Override
    public  void run(){
        TestMain testMain =new TestMain();
        Vector vector = testMain.getVector();
        Object o = vector.get(1);
        System.out.println("MyThread2:"+o);
    }
}
