package ThreeDShapes;

public abstract class RoundShape implements Shape {
    private double baseRadius;
    private double height;
    private String name;

    public RoundShape(double baseRadius, double height, String name){
        this.baseRadius=baseRadius;
        this.height=height;
        this.name=name;
    }
    public double getBaseRadius() {
        return baseRadius;
    }

    public double getHeight() {
        return height;
    }
    public double getBaseArea(){
        return Math.PI*Math.pow(getBaseRadius(),2);
    }

    public double getVolume(){
        return Math.PI*getBaseRadius()*getBaseRadius()*getHeight();

    }
    public double getSurfaceArea(){
        return Math.PI*getBaseRadius()*expression();
    }
    public abstract double expression();
}
