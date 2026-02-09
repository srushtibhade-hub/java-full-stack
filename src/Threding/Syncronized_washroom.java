package Threding;

public class Syncronized_washroom {
    public static void main() {
//using synchronized
        WashRoom2 obj=new WashRoom2();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
    }
}
class WashRoom2 implements Runnable{
    synchronized public void run() {
        try {
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" enter in washroom");
            System.out.println();
            Thread.sleep(2000);
            System.out.println(tName+" using washroom");
            Thread.sleep(2000);
            System.out.println(tName+" exit washroom");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
