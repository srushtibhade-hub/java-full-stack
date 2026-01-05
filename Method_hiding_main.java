package new_java_fullstack;

public class Method_hiding_main {
    public static void main(String[] args) {
        Parent3 obj=new Parent3();
        obj.disp();
        Child3 obj1=new Child3();
        obj1.disp();
        Parent3 obj2=new Child3();
        obj2.disp();

    }
}
class Parent3{
  static void disp(){
        System.out.println("parent class");
    }
}
class Child3 extends Parent3{
   static void disp(){
        System.out.println("child class");
    }
}

