package ThreeDShapes;

public class Cylinder extends RoundShape {
    public Cylinder(double baseRadius, double height, String name){
        super(baseRadius,height,name);
    }
    public double expression() {
        return 2*getHeight()+2*getBaseRadius();
    }
}
