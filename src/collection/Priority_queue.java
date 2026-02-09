package collection;

import java.util.PriorityQueue;

public class Priority_queue {
    static void main() {
        PriorityQueue obj=new PriorityQueue();
        obj.add(100);
        obj.add(100);
        //  obj.add(null);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        //  obj.add(100);
        obj.add(125);
        obj.add(175);
        System.out.println(obj);
    }
}
