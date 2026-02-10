package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Using_iterator {
    static void main() {
        ArrayList obj = new ArrayList();
        //accesssing element using iterator
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);
        obj.add(50);
        obj.add(60);
        obj.add(70);
        obj.add(80);
        obj.add(90);

        Iterator itr =obj.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+" ");
        }

    }
}
