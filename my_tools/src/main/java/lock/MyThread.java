package lock;

import java.util.Vector;

/**
 * @author shenhufei
 * @version 1.0
 * @Description:
 * @date 20200618
 */
public class MyThread extends  Thread{
    @Override
    public  void run(){
        TestMain testMain =new TestMain();
        Vector vector = testMain.getVector();
        Object o = vector.get(0);
        System.out.println("MyThread:"+o);
    }
}
