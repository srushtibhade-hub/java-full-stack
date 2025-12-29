package new_java_fullstack;

public class Child_main {
    //inheritance rule 1
    // in rule 2 private data is not allow to access to parent property and behavior

    public static void main(String[] args) {
        Child obj=new Child();
        System.out.println(obj.a);
        System.out.println("--------------------");
        obj.disp();
    }
}
