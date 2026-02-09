package collection;
import java.util.HashSet;

public class Hash_Set {
    static void main(String[] args) {
        //continuous memory allocation and not link the data to each other
        HashSet obj=new HashSet();
        obj.add(100);
        obj.add(100);
        obj.add(150);
        obj.add(25);
        obj.add(75);
        obj.add(125);
        obj.add(175);
        System.out.println(obj);
    }
}
