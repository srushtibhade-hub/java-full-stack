package new_java_fullstack;

import java.util.Scanner;

public class Code_calsi_main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     /*Srushti obj=new Srushti();
     Sakshi obj1=new Sakshi();*/
        System.out.println("Enter any two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator\nAddition(+)\nSubstraction(-)\n" +
                "Multiplication(*)\nDivisio(/)");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("wrong input");

        }
    }
}

