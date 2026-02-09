package Comparable_interface;

import java.util.ArrayList;
import java.util.Collections;

public class Pasenger_detail_main {
    static void main(String[] args) {
//POJO class
        Pasenger_detail obj = new Pasenger_detail(1, "srushti", "katol", "nagpur");
        Pasenger_detail obj1 = new Pasenger_detail(2, "sakshi", "hinganghat", "nagpur");
        Pasenger_detail obj2 = new Pasenger_detail(3, "prachi", "amravati", "nagpur");
        Pasenger_detail obj3 = new Pasenger_detail(4, "sahili", "pauni", "nagpur");
        Pasenger_detail obj4 = new Pasenger_detail(5, "surbhi", "chandrapur", "nagpur");
        ArrayList al = new ArrayList();
        al.add(obj2);
        al.add(obj);
        al.add(obj1);
        al.add(obj4);
        al.add(obj3);
        Collections.sort(al);
        //sort internally call swap() if value get 1 from compareTo()
        System.out.println(al);

    }
}
    class Pasenger_detail implements Comparable {
        int id;
        String name;
        String Destination_from, Destination_to;

        Pasenger_detail(int id, String name, String destination_from, String destination_to) {
            this.id = id;
            this.name = name;
            this.Destination_from = destination_from;
            this.Destination_to = destination_to;
        }

        public String toString() {
            return this.id + " " + this.name + " " + this.Destination_from + "-" + this.Destination_to;
        }

        public int compareTo(Object o) {
            //swapping logic
            //for reverse swapping change the value of one by replacing sing of that
            if (this.id > (((Pasenger_detail) (o)).id)) {
                return 1;
            } else {
                return -1;
            }
        }

}
