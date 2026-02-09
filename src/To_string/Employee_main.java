package To_string;

public class Employee_main {
    static void main(String[] args) {
        Employee obj=new Employee(1,"srushti",4500000);
        //both work same using toString or not compiler automatically call it
        System.out.println(obj.toString());
        System.out.println(obj);
    }
}
class Employee{
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
}