package new_java_fullstack;

import java.util.Scanner;

public class Kod_calsi_main {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
     /*Srushti obj=new Srushti();
     Sakshi obj1=new Sakshi();
        System.out.println("Enter your choice\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
        int n= sc.nextInt();
        switch (n){
            case 1:
                obj1.add();
                break;
            case 2:
                obj1.sub();
                break;
            case 3:
                obj1.mul();
                break;
            case 4:
                obj1.div();
                break;
            default:
                System.out.println("wrong input");

        }*/
        call(new Srushti());
        System.out.println("Another class implementation");
        call(new Sakshi());


    }
    static void call(Cod_calsi obj){
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
interface Cod_calsi{
    public final static int s=4;
    abstract void add();
    abstract void sub();
    abstract void mul();
    abstract void div();

}
class Srushti extends Object implements Cod_calsi{

    @Override
    public void add() {
    int a=10;
    int b=5;
        System.out.println("Addition is:"+(a+b));
    }
    @Override
    public void sub() {
        int a=10;
        int b=5;
        System.out.println("Substraction is:"+(a-b));
    }

    @Override
    public void mul() {
        int a=10;
        int b=5;
        System.out.println("Multiplication is:"+(a*b));
    }

    @Override
    public void div() {
        int a=10;
        int b=5;
        System.out.println("Division is:"+(a/b));
    }
}
class Sakshi implements Cod_calsi{

    @Override
    public void add() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition is:"+a+b);
    }

    @Override
    public void sub() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Substraction is:"+(a-b));
    }

    @Override
    public void mul() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Multiplication is:"+(a*b));
    }

    @Override
    public void div() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Division is:"+(a/b));
    }
}