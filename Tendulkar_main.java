package new_java_fullstack;

public class Tendulkar_main {
    public static void main(String[] args) {
        Tendulkar obj=new Arjuntendulkar();
        obj.job();
        obj.profession();
        //obj.smoke this method can't accessible by the parent reference class because it is special method of child class
        //downcasting
        ((Arjuntendulkar)obj).smoke();
    }
}
class Tendulkar{
    void job(){
        System.out.println("play cricket");
    }
    void profession(){
        System.out.println("he is batsman");
    }
}
class Arjuntendulkar extends Tendulkar{
    void profession(){
        System.out.println("he is bowler");
    }
    void smoke(){
        System.out.println("he smoke some times");
    }
}

