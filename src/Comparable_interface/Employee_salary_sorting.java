package Comparable_interface;

import collection.Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Employee_salary_sorting {
    //for  id
    static void main(String[] args) {
        Employee1 obj=new Employee1(1,"srushti",4500000);
        Employee1 obj1=new Employee1(2,"sakshi",4500000);
        Employee1 obj2=new Employee1(3,"prachi",4500000);
        ArrayList al=new ArrayList();
        al.add(obj1);
        al.add(obj2);
        al.add(obj);
        Collections.sort(al);
        System.out.println(al);

    }
}
class Employee1 implements Comparable{
    int id;
    String name;
    int salary;
    public Employee1(int id, String name, int salary) {
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
        if(this.salary>(((Employee1)(o)).salary)){
            return 1;
        }else {
            return -1;
        }    }
}
