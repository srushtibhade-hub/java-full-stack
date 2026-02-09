package comparator_interface;

class Employee  {
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

//    @Override
//    public int compareTo(Object o) {
//        //swapping logic
//        //for reverse swapping change the value of one by replacing sing of that
//        if(this.id>(((Comparable_interface.Employee)(o)).id)){
//            return 1;
//        }else {
//            return -1;
//        }    }
}
