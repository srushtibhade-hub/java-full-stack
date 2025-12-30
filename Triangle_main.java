package new_java_fullstack;

import java.util.Scanner;

public class Triangle_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base and height");
        int b=sc.nextInt();
        int h=sc.nextInt();
        Triangle obj=new Triangle(b,h);
        System.out.println(obj.disp());
    }
}
