package new_java_fullstack;

public class Security_main1 {
    public static void main(String[] args) {
Security1 obj=new Airforce1();
Security1 obj1=new Army1();
Security1 obj2=new Navy1();
        System.out.println("<<<<ARMY DATA>>>>");
        obj1.job();
        obj1.protect();
        ((Army1)obj1).use_tank();
        System.out.println("\n<<<<AIR_FORCE DATA>>>>");
        obj.job();
        obj.protect();
        ((Airforce1)obj).usejets();
        System.out.println("\n<<<<NAVY DATA>>>>");
        obj2.job();
        obj2.protect();
        ((Navy1)obj2).use_ship();
    }

}
class Security1 {
    void job(){
        System.out.println("To provide security");
    }
    void protect(){
        System.out.println("To protect the nation");
    }
}
 class Navy1 extends Security1 {
    @Override
    void protect() {
        System.out.println("navy protects the ocean");

    }
    void use_ship(){
        System.out.println("Navy use Ships");
    }
}
class Army1 extends Security1 {
    @Override
    void protect() {
        System.out.println("Army protects the Land");
    }

    void use_tank(){
        System.out.println("Army use tank");
    }
}
class Airforce1 extends Security1 {
    @Override
    void protect() {
        System.out.println("airforce protects the air");

    }
    void usejets(){
        System.out.println("airforce use jets");
    }
}

