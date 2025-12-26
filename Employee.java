package new_java_fullstack;

import java.util.WeakHashMap;

public class Employee {
    int emp_id;
    String name;
    int salary;
    //local chaining
    public Employee(){
        this(1,"sf",5);

        System.out.println("0 parameterized constructor is called");
    }
    public Employee(int emp_id){
        //super()
              System.out.println("1 parameterized constructor is called");
    }
    public Employee(int emp_id,String name){
        this(101);
        System.out.println("2 parameterized constructor is called");

    }
    public Employee(int emp_id,String name,int salary){
        this(101,"srushti");
        System.out.println("3 parameterized constructor is called");
    }
}
