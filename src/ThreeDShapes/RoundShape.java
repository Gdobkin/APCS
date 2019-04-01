package ThreeDShapes;

/**
 * This is an abstract class which will be extended by cones and cylinders
 */
public abstract class RoundShape implements Shape {
    private double baseRadius;
    private double height;
    private String name;

    /**
     * This is a round shape constructor
     * @param baseRadius - radius of the base
     * @param height - height of the object
     * @param name - name of the object
     */
    public RoundShape(double baseRadius, double height, String name){
        this.baseRadius=baseRadius;
        this.height=height;
        this.name=name;
    }

    /**
     * This is a getter for the base radius
     * @return - radius of the base
     */
    public double getBaseRadius() {
        return baseRadius;
    }

    /**
     * This is a getter for height
     * @return - height of the shape
     */
    public double getHeight() {
        return height;
    }

    /**
     * This is a method that will find the base area
     * which is just the area of the circular face
     * @return - area of the base
     */
    public double getBaseArea(){
        return Math.PI*Math.pow(getBaseRadius(),2);
    }

    /**
     * This is the basic volume method for round shapes
     * @return -  the volume of a round shape
     */
    public double getVolume(){
        return Math.PI*getBaseRadius()*getBaseRadius()*getHeight();

    }

    /**
     * This returns the surface area of the round shape multiplied by an expression unique to each subclass
     * @return - surface area of the shape
     */
    public double getSurfaceArea(){
        return Math.PI*getBaseRadius()*expression();
    }

    /**
     * This is the unique expression to be created in each subclass that is used to find surface area
     * @return - the value of the expression
     */
    public abstract double expression();
}
