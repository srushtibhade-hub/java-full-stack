package new_java_fullstack;

public class Trainer_main {
    public static void main(String[] args) {
        Trainer obj;
         obj=new Java_Trainer();
        obj.teaches();
        obj=new Apti_Trainer();
        obj.teaches();
         obj=new Testing_Trainer();
        obj.teaches();
    }
}
class Trainer{
    void teaches(){
        System.out.println("trainer teach to the student");
    }
}
class Java_Trainer extends Trainer{
    void teaches(){
        System.out.println("java trainer teach the java");
    }
}
class Apti_Trainer extends Trainer{
    void teaches(){
        System.out.println("Apti trainer teach Aptitude");
    }
}
class Testing_Trainer extends Trainer{
    void teaches(){
        System.out.println("testing trainer teach testing");
    }
}