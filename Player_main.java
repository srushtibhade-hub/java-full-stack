package new_java_fullstack;

public class Player_main {
    public static void main(String[] args) {
        Football obj=new Football(100);
        System.out.println("player name is:"+obj.getName("xyz"));
       System.out.println("age is:"+obj.getAge(21));
        System.out.println("best score:"+obj.getBest_score(20));
        System.out.println("goal is:"+obj.getGoal());
       // System.out.println("name is:"+obj.name="Srushti");
        obj.name="Sakshi";
        System.out.println(obj.name);
    }
}
