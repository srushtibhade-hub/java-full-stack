package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student_name {
    static void main(String[] args) {
        Student obj=new Student(21,"female","srushtibhade@gmail.com","nagpur","o"
        ,7,34589949,88,5.6f,47,"Srushti");
        Student obj1=new Student(21,"female","srushtibhade@gmail.com","nagpur","o"
                ,7,34589949,88,5.6f,47,"sakshi");
        Student obj2=new Student(21,"female","srushtibhade@gmail.com","nagpur","o"
                ,7,34589949,88,5.6f,47,"prachi");
        HashMap obj3=new HashMap();
        obj3.put(4,obj2);
        obj3.put(4,obj);
        obj3.put(3,obj1);
        System.out.println(obj3);
        LinkedHashMap obj4=new LinkedHashMap();
        obj4.put(4,obj3);
        obj4.put(1,obj);
        obj4.put(3,obj1);
        System.out.println(obj4);
    }
}
class Student {
    String name, gender, email, address, blood_group;
    int age, sem;
    long phone_number;
    float marks, height, weight;

    public Student(int age, String gender, String email, String address, String blood_group, int sem, long phone_number, float marks, float height, float weight, String name) {
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.blood_group = blood_group;
        this.sem = sem;
        this.phone_number = phone_number;
        this.marks = marks;
        this.height = height;
        this.weight = weight;
        this.name = name;
    } public String toString() {
        return name+" "+age+" "+gender+" "+email+" "+address+" "+sem+" "+phone_number+" "+marks+" "+height+" "+weight;
    }

}
