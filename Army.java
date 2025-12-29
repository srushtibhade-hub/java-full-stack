package new_java_fullstack;

public class Army extends Security {
    @Override
    void protect() {
        System.out.println("Army protects the Land");
    }

    void use_tank(){
        System.out.println("Army use tank");
    }
}
