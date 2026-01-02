package new_java_fullstack;

import java_fullstack.Sample;

import java.util.Scanner;

public class Shape_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice\n1.Circle\n2.Triangle\n3.Square");
        int n=sc.nextInt();
        if(n==1){
        disp(new Circle());}
        else if (n==2){
        disp(new Triangle1());}
        else if (n==3) {
            disp(new Square());
        }
        else {
            System.out.println("invalid input");
        }
    }
    static void disp(Shape s){
        s.find_area();
        s.disp_area();
    }
}
abstract class Shape{
    double area;
    abstract void find_area();
    abstract void disp_area();
}
class Circle extends Shape{
Scanner sc=new Scanner(System.in);
    void find_area() {
        System.out.println("Enter the radius");
        int r= sc.nextInt();
       area=3.14*r;
    }
    void disp_area() {
        System.out.println("Area of Circle is:"+area);
    }
}

class Triangle1 extends Shape{
    Scanner sc=new Scanner(System.in);
    static  float half=0.5f;
    void find_area() {
        System.out.println("Enter base and height");
        int b= sc.nextInt();
        int h=sc.nextInt();
        area=half*b*h;
    }
    void disp_area() {
        System.out.println("Area of triangle is:"+area);
    }

}
class Square extends Shape{
    Scanner sc=new Scanner(System.in);
    void find_area() {
        System.out.println("Enter the area");
        int a=sc.nextInt();
        area=a*a;
    }
    void disp_area() {
        System.out.println("Area of square is:"+area);
    }
}
