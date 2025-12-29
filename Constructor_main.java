package new_java_fullstack;

public class Constructor_main {
    public static void main(String[] args) {
B obj=new B();
        System.out.println(obj.a+" "+obj.b);
    }
}
class A{
    int a,b;
    public A(){
        a=10;
        b=20;
    }

    public A(int a,int b){
        this.a=a;
        this.b=b;
    }
}
class B extends A{
    public B(){
        a=30;
        b=40;
    }
    public B(int a,int b){
        this.a=a;
        this.b=b;
    }
}
