package Threding;

public class WashRoom_main1 {
    public static void main() throws InterruptedException {
//  one by one thread execute
        WashRoom1 obj=new WashRoom1();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
class WashRoom1 implements Runnable {

    @Override
    public void run() {
        try {
            String tName = Thread.currentThread().getName();
            System.out.println(tName+" enter in washroom");
            Thread.sleep(2000);
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
