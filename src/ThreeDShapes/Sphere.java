package ThreeDShapes;

public class Sphere implements Shape{
    private String name;
    private double radius;

    public Sphere(String name, double radius){
        this.name=name;
        this.radius=radius;
    }

    public double getVolume() {
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }

    public double getSurfaceArea(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    public double getRadius(){
        return radius;
    }
}
