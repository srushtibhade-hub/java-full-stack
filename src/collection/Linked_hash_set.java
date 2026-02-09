package collection;

import java.util.LinkedHashSet;

public class Linked_hash_set {
    static void main(String[] args) {
        //it use for preseve the order of insertion scatterd memory utilization
        LinkedHashSet obj=new LinkedHashSet();
        obj.add(100);
        obj.add(50);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(125);
        obj.add(175);
        System.out.println(obj);
    }
}
