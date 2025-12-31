package new_java_fullstack;

public class Laptop_main {
    public static void main(String[] args) {
Laptop l=new Laptop();
        l.obj.getdata();
Charger c=new Charger("window",68);
l.hasA(c);
    }
}
class Charger{
    String brand;
    int power;
    public Charger(String brand,int power){
        this.brand=brand;
        this.power=power;
    }
    void getData(){
        System.out.println("brand name:"+brand);
        System.out.println("power:"+power);
    }
}
class Laptop{
Operating_System obj=new Operating_System("window",12.0f);

void hasA(Charger ch){
    ch.getData();
}
}
class Operating_System{
    String  version;
    float brand;
    public Operating_System(String version,float brand){
        this.brand=brand;
        this.version=version;
    }
    void getdata(){
        System.out.println("brand:"+brand);
        System.out.println("version:"+version);
    }
}
