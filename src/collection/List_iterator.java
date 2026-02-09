package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_iterator {
    static void main() {
        ArrayList obj = new ArrayList();
        //accessing element using list iterator for reverse iterator
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(70);
        obj.add(80);
        obj.add(90);
        Iterator itr = obj.listIterator();
        System.out.println("sequence");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("reverse");
        ListIterator litr = obj.listIterator(obj.size());
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
