package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Decending_iterator {
    static void main() {
        LinkedList obj = new LinkedList();
        //decending iterator
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(90);

        obj.add(70);
        obj.add(80);

        Iterator it= obj.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
