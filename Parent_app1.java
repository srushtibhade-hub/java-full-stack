package new_java_fullstack;

public class Parent_app1 {
    public static void main(String[] args) {
        Child1 obj=new Child1();
        obj.disp();
    }

}
class Parent1{
    int x=10;
  //int x=20;
    void disp(){
        System.out.println(x);
    }
}
class Child1 extends Parent1
{
    int x=20;
    void disp(){
        System.out.println(super.x);
    }
}
