package new_java_fullstack;

public class Triangle {
    int base,height;
    static  float half=0.5f;
    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    double disp(){
        return base*height*half;
    }
}
