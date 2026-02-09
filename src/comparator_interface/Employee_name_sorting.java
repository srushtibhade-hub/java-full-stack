package comparator_interface;
import collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Employee_name_sorting  {
    //for  name
    static void main(String[] args) {
        Employee obj=new Employee(1,"Srushti",4500000);
        Employee obj1=new Employee(2,"Sakshi",4500000);
        Employee obj2=new Employee(3,"Prachi",4500000);
        Employee obj3=new Employee(4,"Sahili",4500000);
        ArrayList al=new ArrayList();
        al.add(obj3);
        al.add(obj1);
        al.add(obj2);
        al.add(obj);
        SortComplexObject1 ob=new SortComplexObject1();
        Collections.sort(al,ob);
        System.out.println(al);
    }

}
class SortComplexObject1 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int res=(((Employee)o1).name).compareTo(((Employee)o2).name);
        if(res>0){
            return 1;
        }return -1;
    }
}
