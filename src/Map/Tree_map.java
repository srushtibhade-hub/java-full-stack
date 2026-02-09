package Map;

import java.util.HashMap;

public class Tree_map {
    static void main(String[] args) {
        Student1 obj=new Student1(21,"female","srushtibhade@gmail.com","nagpur","o"
                ,7,34589949,88,5.6f,47,"Srushti");
        Student1 obj1=new Student1(21,"female","srushtibhade@gmail.com","nagpur","o"
                ,7,34589949,88,5.6f,47,"sakshi");
        Student1 obj2=new Student1(21,"female","srushtibhade@gmail.com","nagpur","o"
                ,7,34589949,88,5.6f,47,"prachi");
        HashMap obj3=new HashMap();
        obj3.put(4,obj2);
        obj3.put(2,obj);
        obj3.put(3,obj1);

        System.out.println(obj3);
    }
}
class Student1 {
    String name, gender, email, address, blood_group;
    int age, sem;
    long phone_number;
    float marks, height, weight;

    public Student1(int age, String gender, String email, String address, String blood_group, int sem, long phone_number, float marks, float height, float weight, String name) {
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

