package Threding;
public class WashRoom_main {
    public static void main() {
//non  monitor
        WashRoom obj=new WashRoom();
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
class WashRoom implements Runnable {

    @Override
    public void run() {
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
