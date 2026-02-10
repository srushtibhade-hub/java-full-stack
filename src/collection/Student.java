package collection;

public class Student {
    String name,gender;
    int id;
    public Student(int id,String name,String gender){
        this.name=name;
        this.id=id;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }
}
