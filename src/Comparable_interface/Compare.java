package Comparable_interface;

public class Compare {
    static void main() {
        String s="SACHIN";
        String s1="SAURAV";
        int r=s.compareTo(s1);
        System.out.println(r);
        if(r>0)
        {
            System.out.println(s+" is greater than "+s1);
        } else if (r<0) {
            System.out.println(s1+" is greater than "+s);
        }else {
            System.out.println(s1+" is equal to "+s);
        }
    }
}
