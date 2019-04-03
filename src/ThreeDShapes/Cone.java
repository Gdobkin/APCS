package ThreeDShapes;

public class Cone extends RoundShape{
    public Cone(double baseRadius, double height, String name){
        super(baseRadius,height,name);
    }
    public double expression() {
       return getBaseRadius()+ getSlantHeight();
    }
    public double getVolume(){
        return (1.0/3.0)*super.getVolume();
    }
    public double getSlantHeight(){
        return Math.sqrt((Math.pow(getHeight(),2)+Math.pow(getBaseRadius(),2)));
    }
}
