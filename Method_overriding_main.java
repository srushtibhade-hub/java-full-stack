package new_java_fullstack;

public class Method_overriding_main {
    public static void main(String[] args) {
        Parent2 obj=new Parent2();
        obj.disp();
        Child2 obj1=new Child2();
        obj1.disp();
        Parent2 obj2=new Child2();
        obj2.disp();

    }
}
class Parent2{
    void disp(){
        System.out.println("parent class");
    }
}
class Child2 extends Parent2{
    void disp(){
        System.out.println("child class");
    }
}
