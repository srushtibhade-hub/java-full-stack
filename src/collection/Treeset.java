package collection;

import java.util.TreeSet;
public class Treeset {
    static void main(String[] args) {
        TreeSet obj=new TreeSet();
        obj.add(100);
        obj.add(100);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(125);
        obj.add(175);
        //obj.add(100);
        System.out.println(obj);
        System.out.println("------upper------");
        System.out.println(obj.ceiling(75));
        System.out.println(obj.higher(75));
        System.out.println(obj.ceiling(70));
        System.out.println(obj.higher(70));
        System.out.println("------lower-----");
        System.out.println(obj.floor(75));
        System.out.println(obj.lower(75));
        System.out.println(obj.floor(70));
        System.out.println(obj.lower(70));
        System.out.println(obj.headSet(75));
        System.out.println(obj.tailSet(75));



    }
}
