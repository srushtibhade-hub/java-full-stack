package new_java_fullstack;

public class Demo {
    static  int a;
    static int b;
    //for static data static memory allocate
    static {
        a=2;
        b=4;
    }
    static void disp(){
        System.out.println(a);
        System.out.println(b);
    }
    //for instance block heap memory are allocate
    int x,y;
    {
        x=5;
        y=6;
    }
    void disp1(){
        System.out.println(x+"\n"+y);
    }

    public static void main(String[] args) {
        Demo.disp();
        Demo obj=new Demo();
        obj.disp1();
    }
}
