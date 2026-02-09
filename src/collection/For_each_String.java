package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class For_each_String {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of student");
        int s=sc.nextInt();
        String[] arr=new String[s];
        System.out.println("enter Student name");
        for(int i=0;i<5;i++){
            arr[i]= sc.next();
        }
        for (String i:arr){
            System.out.print(i+" ");
        }
    }
}
