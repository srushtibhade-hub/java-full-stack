package new_java_fullstack;

public class Area_of_circle {
    float pi;
    int r;
    public Area_of_circle(Float pi,int r){
        this.pi=pi;
        this.r=r;

    }
    float disp(){
        return r*pi*r;
    }
}
