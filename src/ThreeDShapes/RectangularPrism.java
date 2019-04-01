package ThreeDShapes;

public class RectangularPrism implements Shape{
    private int length;
    private int width;
    private int height;
    private String name;

    /**
     * The constructor for a rectangular prism
     * @param length - object length
     * @param width - object width
     * @param height - object height
     * @param name - object name
     */
    public RectangularPrism(int length, int width, int height, String name){
        this.length=length;
        this.width=width;
        this.height=height;
        this.name=name;
    }

    /**
     * This method computes the surface area for a rectangular prism
     * @return - object's surface area
     */
    public double getSurfaceArea() {
        return 2*(length*width+length*height+width*height);
    }

    /**
     * This method computes the volume for a rectangular prism
     * @return -  object's volume
     */
    public double getVolume() {
        return length*width*height;
    }
}
