package new_java_fullstack;

public class Student_main {
    public static void main(String[] args) {
        Student s=new Student();
        s=null;
     //  s.obj.getdata();
        Bike b=new Bike("honda",1000000,"black");

       s.hasA(b);
        b.getData();

    }
}
class Bike{
    String brand;
    int price;
    String color;
    public Bike(String brand,int price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
    void getData(){
        System.out.println("brand name:"+brand);
        System.out.println("price:"+price);
        System.out.println("color:"+color);
    }
}
class Student{
    Heart obj=new Heart("pumping the blood",2);

    void hasA(Bike ch){
        ch.getData();
    }
}
class Heart{
    String  job;
    int weight;
    public Heart(String job,int weight){
        this.weight=weight;
        this.job=job;
    }
    void getdata(){
        System.out.println("Heart job is:"+job);
        System.out.println("Heart weight is:"+weight);
    }
}
