package ThreeDShapes;

public class Sphere implements Shape{
    private String name;
    private double radius;

    /**
     * Constructor for sphere
     * @param name - name of the shape
     * @param radius - radius of the sphere
     */
    public Sphere(String name, double radius){
        this.name=name;
        this.radius=radius;
    }

    /**
     * This method computes the volume of the sphere
     * @return - the sphere's voulume
     */
    public double getVolume() {
        return (4.0/3.0)*Math.PI*Math.pow(radius,3);
    }

    /**
     * This method computes the surface area of the sphere
     * @return - surface area of the sphere
     */
    public double getSurfaceArea(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    /**
     * This is a getter for the sphere's radius
     * @return - the radius of the circle
     */
    public double getRadius(){
        return radius;
    }
}
