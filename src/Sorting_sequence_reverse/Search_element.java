package Sorting_sequence_reverse;

import java.util.ArrayList;
import java.util.Collections;

public class Search_element {
    static void main() {
        ArrayList obj = new ArrayList();
        obj.add(100);
        obj.add(100);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(125);
        obj.add(175);
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(Collections.binarySearch(obj,175));
        System.out.println(Collections.binarySearch(obj,5));
        //for rotation
        Collections.rotate(obj,3);
        System.out.println("After rotate "+obj);
        //mininum number finding maximum
        System.out.println(Collections.min(obj));
        System.out.println(Collections.max(obj));
        System.out.println(Collections.frequency(obj,100));
 // for replacement
        System.out.println(Collections.replaceAll(obj,100,7));
        System.out.println(obj);
        Collections.shuffle(obj);
        System.out.println(obj);
    }
}
