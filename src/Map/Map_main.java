package Map;

import java.util.*;

public class Map_main {
    static void main(String[] args) {
        Map obj=new HashMap();
        obj.put(101,1);
        obj.put(102,2);
        obj.put(103,3);
        obj.put(104,4);
        obj.put(105,5);
        obj.put(106,6);
        obj.values();
        System.out.println("==================\nkey");
        Set obj2=obj.keySet();
        Iterator itr =obj2.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
        System.out.println("===========================\nvalues");
        Collection value=obj.values();
        Iterator itr1 =value.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next()+" ");
        }
        System.out.println("========================\nkey-value");
         Set kv=obj.entrySet();
        Iterator itr2 =kv.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next()+" ");
        }
        System.out.println("key_value: "+obj);
        System.out.println("values"+obj.values());
        System.out.println("keys"+obj.keySet());
        System.out.println("key_values using inbuilt method "+obj.entrySet());
    }
}
