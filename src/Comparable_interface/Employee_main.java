package Comparable_interface;

import collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employee_main {
    //for  id
    static void main(String[] args) {
        Employee obj=new Employee(1,"srushti",4500000);
        Employee obj1=new Employee(2,"sakshi",4500000);
        Employee obj2=new Employee(3,"prachi",4500000);
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj);
        Collections.sort(al);
        System.out.println(al);

    }
}
class Employee implements Comparable{
    int id;
    String name;
    int salary;
    public Employee(int id, String name, int salary) {
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
        if(this.id>(((Employee)(o)).id)){
            return 1;
        }else {
            return -1;
        }    }
}
