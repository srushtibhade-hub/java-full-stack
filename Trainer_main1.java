package new_java_fullstack;

public class Trainer_main1 {
    //code reduction
    public static void main(String[] args) {
        duty(new Java_Trainer1());
        duty(new Apti_Trainer1());
        duty(new Testing_Trainer1());
    }
    static void duty(Trainer1 obj) {
        obj.teaches();
    }
}
class Trainer1{
    void teaches(){
        System.out.println("trainer teach to the student");
    }
}
class Java_Trainer1 extends Trainer1{
    void teaches(){
        System.out.println("java trainer teach the java");
    }
}
class Apti_Trainer1 extends Trainer1{
    void teaches(){
        System.out.println("Apti trainer teach Aptitude");
    }
}
class Testing_Trainer1 extends Trainer1{
    void teaches(){
        System.out.println("testing trainer teach testing");
    }
}
