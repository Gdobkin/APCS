package Ch9Inheritance;
//implements shape and shape's methods
public class CircleV1 implements ShapeV1 {
    private double radius;
    public CircleV1(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    } public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
