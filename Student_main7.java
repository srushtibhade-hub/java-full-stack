package new_java_fullstack;

public class Student_main7 {
    public static void main(String[] args) {
        Student7 s=new Student7();
        //calling heart class method
        s.obj.getdata();

        //calling brain class method
        System.out.println(s.obj1.getJob());
        System.out.println( s.obj1.getWeight());


        Bike7 bk=new Bike7("honda",1000000,"black");
             s.hasA(bk);
        bk.getData();

        Book b=new Book(50,"notebook");
      //  s.hasA(b);
        //System.out.println(b.getName());
       // System.out.println(b.getPrice());


    }
}
//Bike class (independent class)
class Bike7{
    String brand;
    int price;
    String color;
    public Bike7(String brand,int price,String color){
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
//book class(independent class)
class Book{
    int price;
    String name;
    public Book(int price,String name){
        this.name=name;
        this.price=price;
    }
    int getPrice(){
        return price;
    }
    String getName(){
        return name;
    }
}
class Student7{
    Heart obj=new Heart("pumping the blood",2);
    Brain obj1=new Brain("Manage body task",3);
    void hasA(Bike7 ch){
        ch.getData();
    }
    void hasA1(Book cd){
        System.out.println("price is:"+cd.getPrice());
        System.out.println("name is:"+cd.getName());
    }
}
//brain class(dependent class)
class Brain{
    String job;
    int weight;
    public Brain(String job,int weight)
    {
        this.job=job;
        this.weight=weight;
    }
    String getJob(){
        return job;
    }
    int getWeight(){
        return weight;
    }
}
//heart class(dependent class)
class Heart7{
    String  job;
    int weight;
    public Heart7(String job,int weight){
        this.weight=weight;
        this.job=job;
    }
    void getdata(){
        System.out.println("Heart job is:"+job);
        System.out.println("Heart weight is:"+weight);
    }
}

