package comparator_interface;

import collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Employee_main  {
    //for  id
    static void main(String[] args) {
        Employee obj=new Employee(1,"srushti",4500000);
        Employee obj1=new Employee(2,"sakshi",4500000);
        Employee obj2=new Employee(3,"prachi",4500000);
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj);
    SortComplexObject ob=new SortComplexObject();
    Collections.sort(al,ob);
        System.out.println(al);
    }

}
class SortComplexObject implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        if(((Employee)o1).id>((Employee)o2).id){
            return 1;
        }return -1;
    }
}