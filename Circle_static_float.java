package new_java_fullstack;

public class Circle_static_float {
   static float pi;
    int r;
    public Circle_static_float(int r){
        this.r=r;
        pi=3.14f;
    }

    float disp(){
        return r*pi*r;
    }
}

