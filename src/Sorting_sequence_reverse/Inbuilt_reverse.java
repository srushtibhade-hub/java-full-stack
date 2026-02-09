package Sorting_sequence_reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inbuilt_reverse {
//second method
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
            System.out.println(obj);
            Comparator comp=Collections.reverseOrder();
            Collections.sort(obj,comp);
            System.out.println(obj);
        }


}
