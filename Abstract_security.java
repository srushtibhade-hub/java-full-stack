package new_java_fullstack;

public class Abstract_security {
    public static void main(String[] args) {

        System.out.println("<<<<ARMY DATA>>>>");
        disp(new Army2());
        System.out.println("\n<<<<AIR_FORCE DATA>>>>");
        disp(new Airforce2());
        System.out.println("\n<<<<NAVY DATA>>>>");
        disp(new Navy2());
    }
    static void disp(Security2 sf){
        sf.protect();
    }

}
abstract class Security2 {
   abstract void protect();
}
class Navy2 extends Security2 {
    @Override
    void protect() {
        System.out.println("navy protects the ocean");

    }
    void use_ship(){
        System.out.println("Navy use Ships");
    }
}
class Army2 extends Security2 {
    @Override
    void protect() {
        System.out.println("Army protects the Land");
    }

    void use_tank(){
        System.out.println("Army use tank");
    }
}
class Airforce2 extends Security2 {
    @Override
    void protect() {
        System.out.println("airforce protects the air");

    }
    void usejets(){
        System.out.println("airforce use jets");
    }
}

