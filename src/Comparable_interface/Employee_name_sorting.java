package Comparable_interface;

import collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;



public class Employee_name_sorting {
    //for  name
    static void main(String[] args) {
        Employee2 obj=new Employee2(1,"srushti",4500000);
        Employee2 obj1=new Employee2(2,"sakshi",4500000);
        Employee2 obj2=new Employee2(3,"prachi",4500000);
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj);
        Collections.sort(al);
        System.out.println(al);

    }
}
class Employee2 implements Comparable{
    int id;
    String name;
    int salary;
    public Employee2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return id + " " + name + " " + salary;
    }

    @Override
    public int compareTo(Object o) {
        //swapping logic
        //for reverse swapping change the value of one by replacing sing of that
        int res=(this.name).compareTo((((Employee2)(o)).name));
        if(res>0) {
            return 1;
        }else {
            return -1;
        }
    }
}

