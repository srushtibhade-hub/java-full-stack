package Sorting_sequence_reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Arr_reverse {
    //first method
    static void main() {
        ArrayList obj=new ArrayList();
        obj.add(100);
        obj.add(100);
        //  obj.add(null);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        //  obj.add(100);
        obj.add(125);
        obj.add(175);
        Collections.sort(obj);
        System.out.println("sorting list:- "+obj);
        Collections.reverse(obj);
        System.out.println("reverse list:- "+obj);
        System.out.println(obj);

    }
}
