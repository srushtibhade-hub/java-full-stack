package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        //it overcome the disadvantages of array,arrylist,arraydequeue,but it not that much efficient

        LinkedList obj=new LinkedList();
        obj.add(10);
        obj.add(20);
        obj.add("srushti");
        obj.addLast("prachi");
        obj.addFirst("sakshi");
        obj.add(1,"sahili");
        System.out.println(  obj.get(3));
        System.out.println(obj);

        LinkedList l=new LinkedList();
        l.push(10);
        l.push(20);
        l.push(30);
        l.add(1,70);
        l.push(60);
        //    l.pop();
        System.out.println("top of the stack:-"+l.peek());

        System.out.println("using push:-"+l);
    }
}
/*output:-20
[sakshi, sahili, 10, 20, srushti, prachi]
top of the stack:-30
using push:-[30, 20, 10]
*/
