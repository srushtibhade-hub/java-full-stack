package new_java_fullstack;

public class Local_chaining {
    int id;
    public Local_chaining(int id){
        //super()
        this.id=id;
    }
    public Local_chaining(){
        this(20);
    }
}
