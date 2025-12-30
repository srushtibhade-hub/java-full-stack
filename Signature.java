package new_java_fullstack;

public class Signature {

     static public  void main(String args[]) {
        System.out.println("hello");
        //for calling other main method
        Signature.main();

    }

    public static void main() {
        System.out.println("srushti");
    }

    public static void main(Integer[] args) {
        System.out.println("sakshi");
    }
}
