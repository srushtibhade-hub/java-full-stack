package new_java_fullstack;

public class Security_main {
    public static void main(String[] args) {
        Navy obj=new Navy();
        Army obj1=new Army();
        Airforce obj2=new Airforce();
        System.out.println("ARMY DATA");
        obj1.job();
        obj1.protect();
        obj1.use_tank();
        System.out.println("NAVY DATA");
        obj.job();
        obj.protect();
        obj.use_ship();
        System.out.println("AIRFORCE DATA");
        obj2.job();
        obj2.protect();
        obj2.usejets();
    }
}
