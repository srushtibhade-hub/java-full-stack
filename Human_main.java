package new_java_fullstack;

public class Human_main {
    public static void main(String[] args) {

    }
}
class Heart2{
    String job;
    void setJob(String job){
        this.job=job;
    }
    String getJob(){
        return job;
    }
}
class Brain2{
    String job;
    void setJob(String job){
        this.job=job;
    }
    String getJob(){
        return job;
    }
}
class Human{
    Heart2 obj=new Heart2();
    Brain2 obj1=new Brain2();
}
class child extends Human{

}
