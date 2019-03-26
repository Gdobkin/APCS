package ThreeDShapes;

public class RectangularPrism implements Shape{
    private int length;
    private int width;
    private int height;
    private String name;

    public RectangularPrism(int length, int width, int height, String name){
        this.length=length;
        this.width=width;
        this.height=height;
        this.name=name;
    }

    public double getSurfaceArea() {
        return 2*(length*width+length*height+width*height);
    }

    public double getVolume() {
        return length*width*height;
    }
}
