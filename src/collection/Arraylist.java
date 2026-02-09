package collection;

import java.util.ArrayList;

public class Arraylist {
    static void main() {
        ArrayList a=new ArrayList();
        a.add(10);
        a.add(10);
        a.add(30);
        a.add(40);
        a.add(null);
        System.out.println("List 1:-"+a);
        a.set(1,50);
        System.out.println("using  set:-"+a);
        ArrayList b=new ArrayList();
        b.add(100);
        b.add(200);
        b.add(10);
        System.out.println("List 2:-"+b);
        a.addAll(b);
        System.out.println("Merge:-"+a);
        a.retainAll(b);
        //retainall give same value of both list
        System.out.println(a);

    }
}
