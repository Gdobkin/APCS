package Ch9Inheritance;
//implements shape and shape's methods
public class CircleV2 extends ShapeV2 {
    private double radius;
    public CircleV2(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    } public double perimeter(){
        return 2 * Math.PI * radius;
    }
}
