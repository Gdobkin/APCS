package Ch9Inheritance;
//implements shape
public class RectangleV1 implements ShapeV1 {
    private double w;
    private double h;
    public RectangleV1(double w, double h){
        this.w=w;
        this.h=h;
    }
    public double area(){
        return w*h;
    } public double perimeter(){
        return 2*w+2*h;
    }
}
