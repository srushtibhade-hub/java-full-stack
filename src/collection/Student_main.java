package collection;
public class Student_main {
    static void main() {
        Student s1=new Student(1,"Srushti","female");
        Student s2=new Student(1,"Srushti","female");
        Student s3=new Student(1,"Srushti","female");
        Student s4=new Student(1,"Srushti","female");
        Student[] arr={s1,s2,s3,s4};
        for(Student s:arr){
            System.out.println(s.getName());
            System.out.println(s.getId());
            System.out.println(s.getGender());
        }
    }
}

