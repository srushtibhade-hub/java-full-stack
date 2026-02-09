package collection;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeueVsLinkedlist {
    //linkeList is more efficient than the ArrayDequeue

    static void main() {
        ArrayDeque obj=new ArrayDeque();
        Long t1=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            obj.push(i);
        }
        Long t2=System.currentTimeMillis();
        LinkedList obj1=new LinkedList();
        Long t3=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            obj1.push(i);
        }
        Long t4=System.currentTimeMillis();
        System.out.println(t4-t3);
        System.out.println(t2-t1);
    }
}
