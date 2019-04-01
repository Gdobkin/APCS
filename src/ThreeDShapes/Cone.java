package ThreeDShapes;

public class Cone extends RoundShape{
    /**
     * Constructor for the cone, it has the super call because cone extends round shape
     * @param baseRadius - radius of the base
     * @param height - the height of the object
     * @param name  - the name of the shape
     */
    public Cone(double baseRadius, double height, String name){
        super(baseRadius,height,name);
    }

    /**
     * This is the implementation of the unique expression used to find surface area
     * @return - value of the expression
     */
    public double expression() {
       return getBaseRadius()+ getSlantHeight();
    }

    /**
     * The get volume method that overrides the super class' get volume method but still uses part of it
     * @return - the volume of the cone
     */
    public double getVolume(){
        return (1.0/3.0)*super.getVolume();
    }

    /**
     * A method which calculates slant height for the a cone, used to calculate surface area expression
     * @return - the slant height of the one
     */
    public double getSlantHeight(){
        return Math.sqrt((Math.pow(getHeight(),2)+Math.pow(getBaseRadius(),2)));
    }
}
