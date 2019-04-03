package ThreeDShapes;

public class Cube implements Shape{
    private int side;
    private String name;

    public Cube(String name, int side){
        this.name=name;
        this.side=side;
    }

    public double getSurfaceArea() {
        return Math.pow(side,2)*6;
    }
    public double getVolume() {
        return Math.pow(side,3);
    }
}
