package ThreeDShapes;

public class Cylinder extends RoundShape {
    /**
     * Constructor for the cylinder, it has the super call because cone extends round shape
     * @param baseRadius - radius of the base
     * @param height - the height of the object
     * @param name  - the name of the shape
     */
    public Cylinder(double baseRadius, double height, String name){
        super(baseRadius,height,name);
    }

    /**
     * This is the implementation of the unique expression used to find surface area
     * @return - value of the expression
     */
    public double expression() {
        return 2*getHeight()+2*getBaseRadius();
    }
}
