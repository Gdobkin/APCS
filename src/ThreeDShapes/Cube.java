package ThreeDShapes;

public class Cube implements Shape{
    private int side;
    private String name;

    /**
     * Constructor for cube
     * @param name
     * @param side
     */
    public Cube(String name, int side){
        this.name=name;
        this.side=side;
    }

    /**
     * This method computes the surface area for a cube
     * @return - the object's surface area
     */
    public double getSurfaceArea() {
        return Math.pow(side,2)*6;
    }

    /**
     * This method computes the volume of a cube
     * @return - the object's volume
     */
    public double getVolume() {
        return Math.pow(side,3);
    }
}
